package com.example.application;

import com.example.application.poses.PoseSet;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
            s += "----------------------------------------\n";
        }
        return s;
    }

    @GetMapping("/angles")
    public String getAngles() {
        String s = "";
        Comparison c;
        for (double[] dlist : CalculateAngles.getLandmarkPoints()) {
            for (double d : dlist) {
                c = new Comparison(d, PoseSet.getTree().getLeftArmAngle(), 10); //class.default
                s+=c.compareAngles()+" ";
            }
        }

        return s;
    }

    @PostMapping("/numeric_data")
    public double[][] receiveNumericData(@RequestBody List<List<Double>> data) { //void
        System.out.println("Method called!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Rows: "+data.size());
        System.out.println("Columns: "+data.get(0).size());

//        this.arr = new Double[data.size()][data.get(0).size()];

        double x = 0.0;
        double y = 0.0;
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) x = data.get(i).get(j);
                if (j == 1) y = data.get(i).get(j);

                //this.arr[i][j] = data.get(i).get(j);
            }
            CalculateAngles.setLandmarkPoints(i, x, y);
        }

        CalculateAngles.print();

        return CalculateAngles.getLandmarkPoints();
    }
}
