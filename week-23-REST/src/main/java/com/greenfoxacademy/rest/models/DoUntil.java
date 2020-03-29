package com.greenfoxacademy.rest.models;

public class DoUntil {

    private int until;
    private int result;

    public DoUntil() {
    }

    public int sum() {
        int counter = 0;
        for (int i = 1; i <= until; i++) {
            counter += i;
        }
        setResult(counter);
        return result;
    }

    public int factor() {
        int factorial = 1;
        for (int i = 2; i <= until; i++) {
            factorial *= i;
        }
        setResult(factorial);
        return result;
    }

    public int getUntil() {
        return until;
    }

    public void setUntil(int until) {
        this.until = until;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
