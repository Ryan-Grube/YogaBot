package com.example.application.poses;

import com.vaadin.flow.component.html.Image;

import java.awt.*;

public class Pose {


    private String img;
    private String poseName;
    private boolean isReversed;
    private double[] actualAngles = new double[10];
    private double[] thresholds = new double[10];
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
    public Pose(String img, String poseName, boolean isReversed, double lArmAngle, double rArmAngle, double lArmpitAngle, double rArmpitAngle,
                double lHipAngle, double rHipAngle, double lLegAngle, double rLegAngle, double lFootAngle, double rFootAngle) {

        this.poseName = poseName;
        this.isReversed = isReversed;
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
        if(isReversed){
            reverse();
        }

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

    public double[] getThresholds() {
        return thresholds;
    }

    public void setThresholds(double t1,
                              double t2,
                              double t3,
                              double t4,
                              double t5,
                              double t6,
                              double t7,
                              double t8,
                              double t9,
                              double t10) {
        thresholds[0] = t1;
        thresholds[1] = t2;
        thresholds[2] = t3;
        thresholds[3] = t4;
        thresholds[4] = t5;
        thresholds[5] = t6;
        thresholds[6] = t7;
        thresholds[7] = t8;
        thresholds[8] = t9;
        thresholds[9] = t10;
    }

    public String getImg() {
        return img;
    }

    public String getPoseName() {
        return poseName;
    }

    public boolean isReversed() {
        return isReversed;
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

    public void reverse(){
        if(img.substring(img.length()-8,img.length()).equals(" (1).png")){
            img = img.substring(0,img.length()-8)+".png";
        }
        else{
            this.img = img.substring(0,img.length()-4)+" (1).png";
        }

        this.lArmAngle = rArmAngle;
        this.rArmAngle = lArmAngle;
        this.lShoulderAngle = rShoulderAngle;
        this.rShoulderAngle = lShoulderAngle;
        this.lHipAngle = rHipAngle;
        this.rHipAngle = lHipAngle;
        this.lLegAngle = rLegAngle;
        this.rLegAngle = lLegAngle;
        this.lFootAngle = rFootAngle;
        this.rFootAngle = lFootAngle;
    }

}
