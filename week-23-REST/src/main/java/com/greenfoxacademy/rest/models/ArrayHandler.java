package com.greenfoxacademy.rest.models;

public class ArrayHandler {
    private String what;
    private int[] numbers;

    public ArrayHandler(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public ArrayHandler() {
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        } return sum;
    }

    public int multiply() {
        int multiply = 1;
        for (int i = 0; i < numbers.length; i++) {
            multiply = multiply * numbers.length;
        } return multiply;
    }

    public int[] doubling() {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length ; i++) {
            result[i] = 2 * numbers[i];
        }
        return result ;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
