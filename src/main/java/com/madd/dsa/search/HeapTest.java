package com.madd.dsa.search;

import com.madd.dsa.model.HeapUtil;
import com.madd.dsa.model.Node;

import java.util.ArrayList;
import java.util.Arrays;

public class HeapTest {

    public static void main(String[] args) {
        HeapUtil mp = new HeapUtil();
        Node n1 = new Node(5);
        Node n2 = new Node(4);
        Node n3 = new Node(3);
        Node n4 = new Node(2);
        Node n5 = new Node(1);
        Node n6 = new Node(0);
        Node n7 = new Node(-1);

        n2.setLeft(n4);
        n2.setRight(n5);

        n3.setLeft(n6);
        n3.setRight(n7);

        n1.setLeft(n2);

        n1.setRight(n3);

        mp.setRoot(n1);

        mp.printBFS(n1);

        int[] arr = {1, 2, 3, 4, 5};

        Node root = HeapUtil.add(new Node(2), null);
        root = HeapUtil.add(new Node(1), root);

        mp.printBFS(root);
    }
}
