package com.example.application.poses;

public class PoseSet {
    private static Pose tree;  //= new Pose("",,,,,,,180,50, )
    private static Pose warrior1;
    private static Pose warrior2;
    private static Pose warrior3;
    private static Pose downwardDog;
    private static Pose cobra;
    private static Pose cat;
    private static Pose cow;
    private static Pose sitting;

    public PoseSet() {}

    public static Pose getDownwardDog() {
        return downwardDog;
    }

    public static Pose getCobra() {
        return cobra;
    }

    public static Pose getCat() {
        return cat;
    }

    public static Pose getCow() {
        return cow;
    }

    public static Pose getSitting() {
        return sitting;
    }
    public static Pose getTree(){
        return tree;
    }

    public static Pose getWarrior1() {
        return warrior1;
    }

    public static Pose getWarrior2() {
        return warrior2;
    }

    public static Pose getWarrior3() {
        return warrior3;
    }
}
