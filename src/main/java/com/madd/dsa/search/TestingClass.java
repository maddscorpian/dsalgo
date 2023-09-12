package com.madd.dsa.search;

public class TestingClass {

    public static void main(String[] args) {
        int intArr[] = {10, 20, 15, 22, 35};
        int target = 15;
        System.out.println("Liner search");
        int idx = SearchUtil.linearSearch(intArr, target);
        System.out.println(String.format("Linear Search - Index of %d is %d", target, idx));
        idx = SearchUtil.binarySearch(intArr, target, 0, intArr.length - 1);
        System.out.println(String.format("Binary Search - Index of %d is %d", target, idx));
    }
}
