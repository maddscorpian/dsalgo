package com.madd.dsa.sort;

public class Sortutils {

    public static int[] bubbleSort(int[] input) {
        int temp;
        int pass = 0;
        for (int i = 0; i < input.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    swapped = true;
                }
            }
            pass++;
            if (!swapped) {
                break;
            }
        }
        System.out.println(String.format("Number of pass %d",pass));
        return input;
    }

    
}
