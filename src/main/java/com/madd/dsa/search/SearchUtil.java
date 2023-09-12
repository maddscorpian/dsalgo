package com.madd.dsa.search;

public class SearchUtil {
    public static int linearSearch(int[] intArr, int target) {
        // Check each element one by one till the target is found else return -1
        for (int i = 0; i < intArr.length; i++) {
            if (target == intArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] input, int target, int start, int end) {
        if (!(end < start)) {
            // Get the middle element.
            int midIdx = (start + end) / 2;
            if (target == input[midIdx]) {
                return midIdx;
            } else if (target > input[midIdx]) {
                // Target is on the right side.
                return binarySearch(input, target, midIdx + 1, end);
            } else if (target < input[midIdx]) {
                // Target is on the left side.
                return binarySearch(input, target, start, midIdx - 1);
            }
        }
        return -1;
    }
}
