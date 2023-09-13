package com.madd.dsa.sort;

import java.util.Arrays;
import java.util.List;

public class TesingSort {

    public static void main(String[] args) {
        int intArr[] = {5,4,3,2,1};
//        //Arrays.stream(Sortutils.bubbleSort(intArr)).forEach(System.out::println);
//        Arrays.stream(Sortutils.insertionSort(intArr)).forEach(System.out::println);
//        Arrays.stream(Sortutils.bubbleSort(intArr)).forEach(System.out::println);
//        //Arrays.asList(intArr).stream().map(x->Integer.valueOf(x)).forEach(System.out::println);
////        Arrays.asList(Sortutils.bubbleSort(intArr)).forEach(System.out::println);
        Arrays.stream(Sortutils.selectionSort(intArr)).forEach(System.out::println);
    }
}
