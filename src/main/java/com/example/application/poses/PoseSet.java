package com.example.application.poses;

public class PoseSet {
    private static Pose treePose = new Pose("/images/treePose.png", "Tree Pose", 60.0, 60.0, -1.0, -1.0, 190.0, 110.0, 180.0, 30.0, -1.0, -1.0);
    private static Pose warrior2 = new Pose("/images/warrior2.png", "Warrior II", 180.0, 180.0, -1.0, -1.0, 120.0, 90.0, 180.0, 90.0, -1.0, -1.0);
    private static Pose downwardDog = new Pose("/images/downwardDog.png", "Downward Dog", 180.0, 180.0, 170.0, 170.0, 40.0, 40.0, 180.0, 180.0, -1.0, -1.0);
    private static Pose bridgePose = new Pose("/images/bridgePose.png", "Bridge Pose", 180.0, 180.0, 60.0, 60.0, 150.0, 150.0, 70.0, 70.0, -1.0, -1.0);
    private static Pose seatedForwardBend = new Pose("/images/seatedForwardBend.png", "Seated Forward Bend", 180.0, 180.0, 90.0, 90.0, 60.0, 60.0, 180.0, 180.0, -1.0, -1.0);
    private static Pose plankPose = new Pose("/images/plankPose.png", "Plank Pose", 95.0, 95.0, 90.0, 90.0, 160.0, 160.0, 180.0, 180.0, -1.0, -1.0);
    private static Pose camelPose = new Pose("/images/camelPose.png", "Camel Pose", 170.0, 170.0, 50.0, 50.0, 150.0, 150.0, 90.0, 90.0, -1.0, -1.0);
    private static Pose warrior1 = new Pose("/images/warrior1.png", "Warrior I", -1.0, -1.0, 160.0, 160.0, 90.0, 110.0, 90.0, 170.0, -1.0, -1.0);
    private static Pose cobraPose = new Pose("/images/cobraPose.png", "Cobra Pose", 120.0, 120.0, 45.0, 45.0, 100.0, 100.0, 180.0, 180.0, -1.0, -1.0);
    private static Pose cowPose = new Pose("/images/cowPose.png", "Cow Pose", 180.0, 180.0, 80.0, 80.0, 100.0, 100.0, 85.0, 85.0, 100.0, 100.0);
    private static Pose catPose = new Pose("/images/catPose.png", "Cat Pose", 180.0, 180.0, 80.0, 80.0, 100.0, 100.0, 90.0, 90.0, -1.0, -1.0);
    private static Pose trianglePose = new Pose("/images/trianglePose.png", "Triangle Pose", 180.0, 180.0, 90.0, 90.0, 60.0, 70.0, 180.0, 170.0, -1.0, -1.0);
    private static Pose extendedSideAnglePose = new Pose("/images/extendedSideAnglePose.png", "Extended Side Angle Pose", 100.0, 180.0, 70.0, 170.0, 70.0, 170.0, 90.0, 175.0, -1.0, -1.0);
    private static Pose childsPose = new Pose("/images/childsPose.png", "Child's Pose", 180.0, 180.0, 160.0, 160.0, 20.0, 20.0, 30.0, 30.0, -1.0, -1.0);
    private static Pose sittingPose = new Pose("/images/sittingPose.png", "Sitting Pose", 160.0, 160.0, -1.0, -1.0, 90.0, 90.0, 10.0, 10.0, -1.0, -1.0);

    public PoseSet() {
        treePose.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
        warrior2.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
        downwardDog.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
        bridgePose.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
        seatedForwardBend.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
        plankPose.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
        camelPose.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
        warrior1.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
        cowPose.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
        catPose.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
        trianglePose.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
        extendedSideAnglePose.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
        childsPose.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
        sittingPose.setThresholds(50, 50, 50, 50, 50, 50, 50, 50, 50, 50);
    }

    public static Pose getTreePose() {
        return treePose;
    }

    public static Pose getWarrior2() {
        return warrior2;
    }

    public static Pose getDownwardDog() {
        return downwardDog;
    }

    public static Pose getBridgePose() {
        return bridgePose;
    }

    public static Pose getSeatedForwardBend() {
        return seatedForwardBend;
    }

    public static Pose getPlankPose() {
        return plankPose;
    }

    public static Pose getCamelPose() {
        return camelPose;
    }

    public static Pose getWarrior1() {
        return warrior1;
    }

    public static Pose getCobraPose() {
        return cobraPose;
    }

    public static Pose getCowPose() {
        return cowPose;
    }

    public static Pose getCatPose() {
        return catPose;
    }

    public static Pose getTrianglePose() {
        return trianglePose;
    }

    public static Pose getExtendedSideAnglePose() {
        return extendedSideAnglePose;
    }

    public static Pose getChildsPose() {
        return childsPose;
    }

    public static Pose getSittingPose() {
        return sittingPose;
    }
}
