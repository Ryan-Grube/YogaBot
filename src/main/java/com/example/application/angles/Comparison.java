package com.example.application.angles;

public class Comparison {
    public Comparison () {}

    public static double compareAngles (double yourAngle, double actualAngle) {
        return actualAngle - yourAngle;
    }

    public static boolean meetsThreshold(double yourAngle, double actualAngle, double threshold) {
        if (Math.abs(compareAngles(yourAngle, actualAngle)) <= threshold) {
            return true;
        }
        return false;
    }
}
