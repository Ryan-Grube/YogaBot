package com.example.application.errors;

public class Errors {
    SingleError[] errors;
    public Errors(int num) {
        errors = new SingleError[num];
    }
    public void addError(int index, SingleError e) {
        errors[index] = e;
    }
    public SingleError[] getError(){
        return errors;
    }
}
