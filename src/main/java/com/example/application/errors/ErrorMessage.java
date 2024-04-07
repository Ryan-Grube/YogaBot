package com.example.application.errors;

import com.example.application.angles.Comparison;

public class ErrorMessage {
    //String errorMessage;
    private static String[][][] errors = {
            {
                {"bend right knee more",
                "bend right knee less"},
                {"bend left knee more",
                "bend left knee less"}
            },
            {
                {"raise right arm",
                "lower right arm"},
                {"raise left arm",
                "lower left arm"}
            },
            {
                {"bend your body more to the right",
                "bend your body more to the left"},
                {"bend your body more to the left",
                "bend your body more to the right"},

            },
            {
                {"retract your right toes",
                "extend your right toes out more"},
                {"retract your left toes",
                "extend your left toes out more"}
            },
            {
                {"bend your right arm more",
                "bend your right arm less"},
                {"bend your left arm more",
                "bend your left arm less"}
            }
    };
//    public ErrorMessage(int num, int param1, int param2) {
//        error = errors[num][param1][param2];
//    }

    public static String[][][] getErrors() {
        return errors;
    }
}
