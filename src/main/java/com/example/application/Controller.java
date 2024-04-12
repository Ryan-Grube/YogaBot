package com.example.application;

import com.example.application.angles.CalculateAngles;
import com.example.application.angles.Comparison;
import com.example.application.poses.Pose;
import com.example.application.poses.PoseSet;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.application.errors.*;

//@CrossOrigin
@RestController
@RequestMapping("test")
public class Controller {
    private Integer variable;
//    private Double[][] arr;

    public Controller() {}

    @GetMapping("/numeric_data")
    public String showNumericData() {
        String s = "";

        for (double[] dlist : CalculateAngles.getLandmarkPoints()) {
            for (double d : dlist) {
                s += String.valueOf(d);
            }
            s += "----------------------------------------";
        }
        return s;
    }

    @GetMapping("/angles")
    public String getAngles() {
        String s = "";
        CalculateAngles.setAngles();
        for (int i = 0; i < 10; i++) {
            s += CalculateAngles.getAngles()[i] + "\n";
        }

        return s;
    }

    @GetMapping("/angle_differences")
    public String getAngleDifferences() {
        String s = "";
        Pose pCurrent = PoseSet.getTreePose();
        CalculateAngles.setAngles();
        for (int i = 0; i < 10; i++) {
            s += Comparison.compareAngles(CalculateAngles.getAngles()[i], pCurrent.getActualAngles()[i]) + "\n";
        }
        return s;
    }

    @GetMapping("/meets_thresholds")
    public String getMeetsThresholds() {
        String s = "";
        Pose pCurrent = PoseSet.getTreePose();
        CalculateAngles.setAngles();
        boolean meets;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            meets = Comparison.meetsThreshold(CalculateAngles.getAngles()[i], pCurrent.getActualAngles()[i], pCurrent.getThresholds()[i]);
            s += meets + "\n";

            if (!meets) {
                count++;
            }
        }
        return s;
    }

    @GetMapping("/error_messages")
    public String getErrorMessages() {
        String s = "";
        Pose pCurrent = PoseSet.getTreePose();
        CalculateAngles.setAngles();

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (!Comparison.meetsThreshold(CalculateAngles.getAngles()[i], pCurrent.getActualAngles()[i], pCurrent.getThresholds()[i])) {
                count++;
            }
        }

        Errors es = new Errors(count);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                if (!Comparison.meetsThreshold(CalculateAngles.getAngles()[i], pCurrent.getActualAngles()[i], pCurrent.getThresholds()[i])) {
                    SingleError e = new SingleError(i, j, CalculateAngles.getAngles()[i], pCurrent.getActualAngles()[i]);
                    es.addError(i, e);
                    s += e.getErrorMessage()+"----------------------------------------";
                }
            }
        }
        return s;
    }

    @PostMapping("/numeric_data")
    public void receiveNumericData(@RequestBody List<List<Double>> data) { //void
        //System.out.println("Method called!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Rows: "+data.size());
        System.out.println("Columns: "+data.get(0).size());

        double x = 0.0;
        double y = 0.0;
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) x = data.get(i).get(j);
                if (j == 1) y = data.get(i).get(j);
            }
            CalculateAngles.setLandmarkPoints(i, x, y);
        }

//        CalculateAngles.print();

        Calculations.getErrorMessages();

//        return CalculateAngles.getLandmarkPoints();
    }
}
