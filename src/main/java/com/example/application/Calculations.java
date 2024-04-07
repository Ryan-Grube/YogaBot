package com.example.application;

import com.example.application.angles.CalculateAngles;
import com.example.application.angles.Comparison;
import com.example.application.errors.Errors;
import com.example.application.errors.SingleError;
import com.example.application.poses.Pose;
import com.example.application.poses.PoseSet;
import com.example.application.views.yoga.YogaView;

public class Calculations {

    private static Errors es;
    private static double[] differences = new double[10];
    public Calculations() {}

//    public void showNumbericData() {
//        for (double[] dlist : CalculateAngles.getLandmarkPoints()) {
//            for (double d : dlist) {
//                System.out.print(String.valueOf(d)+" ");
//            }
//            System.out.println();
//        }
//    }

    public static void getAngles() {
        CalculateAngles.setAngles();
        for (int i = 0; i < 10; i++) {
            System.out.println(CalculateAngles.getAngles()[i]);
        }
    }

    public static void getAngleDifferences() {
        Pose pCurrent = YogaView.getPose();
        CalculateAngles.setAngles();
        for (int i = 0; i < 10; i++) {
            differences[i] = Comparison.compareAngles(CalculateAngles.getAngles()[i], pCurrent.getActualAngles()[i]);
        }
    }

    public static void getMeetsThresholds() {
        Pose pCurrent = YogaView.getPose();
        CalculateAngles.setAngles();
        boolean meets;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            meets = Comparison.meetsThreshold(CalculateAngles.getAngles()[i], pCurrent.getActualAngles()[i], pCurrent.getThresholds()[i]);
            if (!meets) count++;
        }
    }

    public static void getErrorMessages() {
        Pose pCurrent = YogaView.getPose();
        CalculateAngles.setAngles();

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (!Comparison.meetsThreshold(CalculateAngles.getAngles()[i], pCurrent.getActualAngles()[i], pCurrent.getThresholds()[i])) {
                count++;
            }
        }

        es = new Errors(count);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                if (!Comparison.meetsThreshold(CalculateAngles.getAngles()[i], pCurrent.getActualAngles()[i], pCurrent.getThresholds()[i])) {
                    SingleError e = new SingleError(i, j, CalculateAngles.getAngles()[i], pCurrent.getActualAngles()[i]);
                    es.addError(i, e);
                    System.out.println(e.getErrorMessage());
                }
            }
        }
    }

    public static Errors getEs() {
        return es;
    }

    public static double[] getDifferences() {
        return differences;
    }
}
