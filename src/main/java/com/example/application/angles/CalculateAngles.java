package com.example.application.angles;

public class CalculateAngles {
    private static double[][] landmarkPoints = new double[33][2];
    private static double[] angles = new double[10];

    public CalculateAngles() {

    }

    public static double[][] getLandmarkPoints() {
        return landmarkPoints;
    }

    public static double[] getAngles() {
        return getAngles(0);
    }

    public static double[] getAngles(int x) {
        setAngles(x);
        return angles;
    }

    public static void setAngles() {
        setAngles(0);
    }

    public static void setAngles(int x) {
//        angles[0] = calculateRightArmAngle(0);
//        angles[1] = calculateLeftArmAngle(0);
//        angles[2] = calculateRightLegAngle(0);
//        angles[3] = calculateLeftLegAngle(0);
//        angles[4] = calculateRightFootAngle(0);
//        angles[5] = calculateLeftFootAngle(0);
//        angles[6] = calculateRightHipAngle(0);
//        angles[7] = calculateLeftHipAngle(0);
//        angles[8] = calculateRightArmpitAngle(0);
//        angles[9] = calculateLeftArmpitAngle(0);

        angles[0] = calculateAngle(x, 11, 13, 15);
        angles[1] = calculateAngle(x, 12, 14, 16);
        angles[2] = calculateAngle(x, 23, 25, 27);
        angles[3] = calculateAngle(x, 24, 26, 28);
        angles[4] = calculateAngle(x, 27, 29, 31);
        angles[5] = calculateAngle(x, 28, 30, 32);
        angles[6] = calculateAngle(x, 11, 23, 25);
        angles[7] = calculateAngle(x, 12, 24, 26);
        angles[8] = calculateAngle(x, 13, 11, 23);
        angles[9] = calculateAngle(x, 14, 12, 24);
    }

    public static void setLandmarkPoints(int index, double x, double y) {
        landmarkPoints[index][0] = x;
        landmarkPoints[index][1] = y;
    }

    public static double calculateAngle(int x, int a, int b, int c) {
        if (x==0) return calculateAngle1(landmarkPoints[a], landmarkPoints[b], landmarkPoints[c]);
        return calculateAngle2(landmarkPoints[a], landmarkPoints[b], landmarkPoints[c]);
    }

//    public static double calculateRightArmAngle(int x) {
//        if (x==0) return calculateAngle1(landmarkPoints[11], landmarkPoints[13], landmarkPoints[15]);
//        return calculateAngle2(landmarkPoints[11], landmarkPoints[13], landmarkPoints[15]);
//    }
//
//    public static double calculateLeftArmAngle(int x) {
//        if (x==0) return calculateAngle1(landmarkPoints[12], landmarkPoints[14], landmarkPoints[16]);
//        return calculateAngle1(landmarkPoints[12], landmarkPoints[14], landmarkPoints[16]);
//    }
//
//    public static double calculateRightLegAngle(int x) {
//        if (x==0) return calculateAngle1(landmarkPoints[23], landmarkPoints[25], landmarkPoints[27]);
//        return calculateAngle1(landmarkPoints[23], landmarkPoints[25], landmarkPoints[27]);
//    }
//
//    public static double calculateLeftLegAngle(int x) {
//        if (x==0) return calculateAngle1(landmarkPoints[24], landmarkPoints[26], landmarkPoints[28]);
//        return calculateAngle1(landmarkPoints[24], landmarkPoints[26], landmarkPoints[28]);
//    }
//
//    public static double calculateRightFootAngle(int x) {
//        if (x==0) return calculateAngle1(landmarkPoints[27], landmarkPoints[29], landmarkPoints[31]);
//        return calculateAngle1(landmarkPoints[27], landmarkPoints[29], landmarkPoints[31]);
//    }
//
//    public static double calculateLeftFootAngle(int x) {
//        if (x==0) return calculateAngle1(landmarkPoints[28], landmarkPoints[30], landmarkPoints[32]);
//        return calculateAngle1(landmarkPoints[28], landmarkPoints[30], landmarkPoints[32]);
//    }
//
//    public static double calculateRightHipAngle(int x) {
//        if (x==0) return calculateAngle1(landmarkPoints[11], landmarkPoints[23], landmarkPoints[25]);
//        return calculateAngle1(landmarkPoints[11], landmarkPoints[23], landmarkPoints[25]);
//    }
//
//    public static double calculateLeftHipAngle(int x) {
//        if (x==0) return calculateAngle1(landmarkPoints[12], landmarkPoints[24], landmarkPoints[26]);
//        return calculateAngle1(landmarkPoints[12], landmarkPoints[24], landmarkPoints[26]);
//    }
//
//    public static double calculateRightArmpitAngle(int x) {
//        if (x==0) return calculateAngle1(landmarkPoints[13], landmarkPoints[11], landmarkPoints[23]);
//        return calculateAngle1(landmarkPoints[13], landmarkPoints[11], landmarkPoints[23]);
//    }
//
//    public static double calculateLeftArmpitAngle(int x) {
//        if (x==0) return calculateAngle1(landmarkPoints[14], landmarkPoints[12], landmarkPoints[24]);
//        return calculateAngle1(landmarkPoints[14], landmarkPoints[12], landmarkPoints[24]);
//    }

    private static double calculateAngle1(double[] pointA, double[] pointB, double[] pointC) {
        double lengthAB = distance(pointA, pointB);
        double lengthBC = distance(pointB, pointC);
        double lengthCA = distance(pointC, pointA);

        double angleB = Math.acos((Math.pow(lengthAB, 2) + Math.pow(lengthBC, 2) - Math.pow(lengthCA, 2)) / (2 * lengthAB * lengthBC));
        return Math.toDegrees(angleB);
    }

    //uses vectors
    public static double calculateAngle2(double[] pointA, double[] pointB, double[] pointC) {

        double x1 = pointA[0];
        double x2 = pointB[0];
        double y1 = pointA[1];
        double y2 = pointB[1];
        double x3 = pointC[0];
        double y3 = pointC[1];

        // Calculate vectors
        double vector1X = x1 - x2;
        double vector1Y = y1 - y2;
        double vector2X = x3 - x2;
        double vector2Y = y3 - y2;

        // Calculate dot product
        double dotProduct = (vector1X * vector2X) + (vector1Y * vector2Y);

        // Calculate magnitudes
        double magnitude1 = Math.sqrt(vector1X * vector1X + vector1Y * vector1Y);
        double magnitude2 = Math.sqrt(vector2X * vector2X + vector2Y * vector2Y);

        // Calculate angle in radians
        double angleRadians = Math.acos(dotProduct / (magnitude1 * magnitude2));

        // Convert radians to degrees

        return Math.toDegrees(angleRadians);
    }

    private static double distance(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));
    }

    public static void print() {
        for (double[] point : landmarkPoints) {
            for (double coordinate : point) {
                System.out.print(coordinate+" ");
            }
            System.out.println();
        }
    }
}
