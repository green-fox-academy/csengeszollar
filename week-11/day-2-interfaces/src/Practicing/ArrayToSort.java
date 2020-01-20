package Practicing;

import java.util.Arrays;

public class ArrayToSort {
    public static void main(String[] args) {
        String[] fruits = new String[] {"Pineapple","Apple", "Mango", "Banana"};

        Arrays.sort(fruits);

        int i=0;
        for(String temp: fruits){
            System.out.println("fruits " + ++i + " : " + temp);
        }
    }
}
