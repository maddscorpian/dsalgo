package com.madd.dsa.sort;

import com.madd.dsa.model.Node;

public class Sortutils {

    public static int[] selectionSort(int[] input) {
        int keyIdx = 0;
        int temp;
        while (keyIdx < input.length) {
            int idx = -1;
            int min = input[keyIdx];
            for (int i = keyIdx + 1; i < input.length; i++) {
                if (min > input[i]) {
                    min = input[i];
                    idx = i;
                }
            }
            // move the min element to the key place.
            if (idx != -1) {
                temp = input[keyIdx];
                input[keyIdx] = min;
                input[idx] = temp;
            }
            // Go to next key.
            keyIdx++;
        }
        return input;
    }

    public static int[] insertionSort(int[] input) {
        System.out.println("insertionSort start");
        int loopCount = 0;
        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                loopCount++;
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println("insertionSort end");
        System.out.println(String.format("Loop Count is %d", loopCount));
        return input;
    }

    public static int[] bubbleSort(int[] input) {
        System.out.println("bubbleSort start");
        int loopCount = 0;
        int temp;
        int pass = 0;
        for (int i = 0; i < input.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < input.length - i - 1; j++) {
                loopCount++;
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
        System.out.println("bubbleSort end");
        System.out.println(String.format("Number of pass %d", pass));
        System.out.println(String.format("Loop Count is %d", loopCount));
        return input;
    }

//    public static Node heepify(int input, Node root) {
//        // Create a node with input
//        Node node = new Node(input);
//        // If there is only one element in the tree.
//        if (root.isSingleNodeTree()) {
//            if (root.getValue() > node.getValue()) {
//                root.setLeft(node);
//                return root;
//            } else {
//                node.setLeft(root);
//                return node;
//            }
//        }
//        while (root != null) {
//
//        }
//    }


}
