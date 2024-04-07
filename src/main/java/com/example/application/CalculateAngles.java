package com.example.application;

public class CalculateAngles {
    private static double[][] landmarkPoints = new double[33][2];
    private static double[] angles = new double[10];
    public CalculateAngles() {
        angles[0] = this.calculateRightArmAngle();
        angles[1] = this.calculateLeftArmAngle();
        angles[2] = this.calculateRightLegAngle();
        angles[3] = this.calculateLeftLegAngle();
        angles[4] = this.calculateRightFootAngle();
        angles[5] = this.calculateLeftFootAngle();
        angles[6] = this.calculateRightHipAngle();
        angles[7] = this.calculateLeftHipAngle();
        angles[8] = this.calculateRightArmpitAngle();
        angles[9] = this.calculateLeftArmpitAngle();
    }

    public static double[][] getLandmarkPoints() {
        return landmarkPoints;
    }
    public static void setLandmarkPoints(int index, double x, double y) {
        landmarkPoints[index][0] = x;
        landmarkPoints[index][1] = y;
    }

    public double calculateRightArmAngle() {
        return calculateAngle(landmarkPoints[11], landmarkPoints[13], landmarkPoints[15]);
    }

    public double calculateLeftArmAngle() {
        return calculateAngle(landmarkPoints[12], landmarkPoints[14], landmarkPoints[16]);
    }

    public double calculateRightLegAngle() {
        return calculateAngle(landmarkPoints[23], landmarkPoints[25], landmarkPoints[27]);
    }

    public double calculateLeftLegAngle() {
        return calculateAngle(landmarkPoints[24], landmarkPoints[26], landmarkPoints[28]);
    }

    public double calculateRightFootAngle() {
        return calculateAngle(landmarkPoints[27], landmarkPoints[29], landmarkPoints[31]);
    }

    public double calculateLeftFootAngle() {
        return calculateAngle(landmarkPoints[28], landmarkPoints[30], landmarkPoints[32]);
    }

    public double calculateRightHipAngle() {
        // Assuming the request for torso angles was for calculating angles using upper body and hips
        return calculateAngle(landmarkPoints[11], landmarkPoints[23], landmarkPoints[25]);
    }

    public double calculateLeftHipAngle() {
        // Assuming the request for torso angles was for calculating angles using upper body and hips
        return calculateAngle(landmarkPoints[12], landmarkPoints[24], landmarkPoints[26]);
    }

    public double calculateRightArmpitAngle() {
        return calculateAngle(landmarkPoints[13], landmarkPoints[11], landmarkPoints[23]);
    }

    public double calculateLeftArmpitAngle() {
        return calculateAngle(landmarkPoints[14], landmarkPoints[12], landmarkPoints[24]);
    }
    private double calculateAngle(double[] pointA, double[] pointB, double[] pointC) {
        double lengthAB = distance(pointA, pointB);
        double lengthBC = distance(pointB, pointC);
        double lengthCA = distance(pointC, pointA);

        double angleB = Math.acos((lengthAB * lengthAB + lengthBC * lengthBC - lengthCA * lengthCA) / (2 * lengthAB * lengthBC));
        return Math.toDegrees(angleB);
    }

    private double distance(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));
    }

    public static void print() {
        String s = "";
        for (double[] point : landmarkPoints) {
            for (double coordinate : point) {
                System.out.print(coordinate+" ");
            }
            System.out.println();
        }
    }
}
