package com.example.application.poses;

public class Pose {

    private String img;
    private double[] actualAngles = new double[10];
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
    public Pose(String img, double lArmAngle, double rArmAngle, double lArmpitAngle, double rArmpitAngle,
                double lHipAngle, double rHipAngle, double lLegAngle, double rLegAngle, double lFootAngle, double rFootAngle) {
        this.img = img;

        this.lArmAngle = lArmAngle;
        this.rArmAngle = rArmAngle;
        this.lShoulderAngle = lArmpitAngle;
        this.rShoulderAngle = rArmpitAngle;
        this.lHipAngle = lHipAngle;
        this.rHipAngle = rHipAngle;
        this.lLegAngle = lLegAngle;
        this.rLegAngle = rLegAngle;
        this.lFootAngle = lFootAngle;
        this.rFootAngle = rFootAngle;

        this.actualAngles[0] = rArmAngle;
        this.actualAngles[1] = lArmAngle;
        this.actualAngles[2] = rLegAngle;
        this.actualAngles[3] = lLegAngle;
        this.actualAngles[4] = rFootAngle;
        this.actualAngles[5] = lFootAngle;
        this.actualAngles[6] = rHipAngle;
        this.actualAngles[7] = lHipAngle;
        this.actualAngles[8] = rArmpitAngle;
        this.actualAngles[9] = lArmpitAngle;

    }

    public double[] getActualAngles() {
        return actualAngles;
    }

    public String getImg() {
        return img;
    }

    public double getLeftArmAngle() {
        return lArmAngle;
    }

    public double getRightArmAngle() {
        return rArmAngle;
    }

    public double getLeftShoulderAngle() {
        return lShoulderAngle;
    }

    public double getRightShoulderAngle() {
        return rShoulderAngle;
    }

    public double getLeftHipAngle() {
        return lHipAngle;
    }

    public double getRightHipAngle() {
        return rHipAngle;
    }

    public double getLeftLegAngle() {
        return lLegAngle;
    }

    public double getRightLegAngle() {
        return rLegAngle;
    }

    public double getLeftFootAngle() {
        return lFootAngle;
    }

    public double getRightFootAngle() {
        return rFootAngle;
    }
}
