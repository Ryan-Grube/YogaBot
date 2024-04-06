package com.example.application.poses;

public class Pose {

    String img;
    private double lArmAngle;
    private double rArmAngle;
    private double lShoulderAngle;
    private double rShoulderAngle;
    private double lHipAngle;
    private double rHipAngle;
    private double lLegAngle;
    private double rLegAngle;
    private double lFootAngle;
    private double rFootAngle;

    //order is: arm, shoulder, hip, leg, foot
    public Pose(String img, double lArmAngle, double rArmAngle, double lShoulderAngle, double rShoulderAngle,
                double lHipAngle, double rHipAngle, double lLegAngle, double rLegAngle, double lFootAngle, double rFootAngle) {
        this.img = img;

        this.lArmAngle = lArmAngle;
        this.rArmAngle = rArmAngle;
        this.lShoulderAngle = lShoulderAngle;
        this.rShoulderAngle = rShoulderAngle;
        this.lHipAngle = lHipAngle;
        this.rHipAngle = rHipAngle;
        this.lLegAngle = lLegAngle;
        this.rLegAngle = rLegAngle;
        this.lFootAngle = lFootAngle;
        this.rFootAngle = rFootAngle;
    }

    public String getImg() {
        return img;
    }

    public double getLArmAngle() {
        return lArmAngle;
    }

    public double getRArmAngle() {
        return rArmAngle;
    }

    public double getLShoulderAngle() {
        return lShoulderAngle;
    }

    public double getRShoulderAngle() {
        return rShoulderAngle;
    }

    public double getLHipAngle() {
        return lHipAngle;
    }

    public double getRHipAngle() {
        return rHipAngle;
    }

    public double getLLegAngle() {
        return lLegAngle;
    }

    public double getRLegAngle() {
        return rLegAngle;
    }

    public double getLFootAngle() {
        return lFootAngle;
    }

    public double getRFootAngle() {
        return rFootAngle;
    }
}
