package com.example.application;

public class Comparison {
    private double yourAngle;
    private double actualAngle;
    private double threshold;

    public Comparison (double yourAngle, double actualAngle, double threshold) {
        this.yourAngle = yourAngle;
        this.actualAngle = actualAngle;
        this.threshold = threshold;
    }

    public double compareAngles () {
        return this.actualAngle - this.yourAngle;
    }

    public boolean meetsThreshold() {
        if (compareAngles() <= this.threshold) {
            return true;
        }
        return false;
    }
}
