package com.example.application.errors;

import com.example.application.angles.Comparison;

public class SingleError {
    private String errorMessage;
    public SingleError(int bodyPart, int leftRight, double angle, double actual) {
        errorMessage = createError(bodyPart, leftRight, angle, actual);
    }

    public String createError(int bodyPart, int leftRight, double angle, double actual) {
        if (Comparison.compareAngles(angle, actual) > 0) {
            return ErrorMessage.getErrors()[bodyPart][leftRight][0];
        } else {
            return ErrorMessage.getErrors()[bodyPart][leftRight][1];
        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
