package com.madd.dsa.model;

import lombok.Data;

import java.util.LinkedList;
import java.util.Queue;

@Data
public class HeapUtil {
    Node root = null;

//    public void add(Node node) {
//        if (root == null) {
//            root = node;
//            return;
//        }
//        if (root.isLeaf()) {
//            if (root.getValue() > node.getValue()) {
//                root.setLeft(node);
//            } else {
//                node.setLeft(root);
//                root = node;
//            }
//        } else {
//
//        }
//    }

    public void print(Node node) {
        if (node == null) {
            return;
        } else {
            System.out.println(node.getValue());
            print(node.getLeft());
            print(node.getRight());
        }
    }

    public void printBFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            // Deque and print.
            Node node = queue.remove();
            System.out.println(node.getValue());
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
    }

    public static Node add(Node node, Node root) {
        // Case 1. No elements in the Tree.
        if (root == null) {
            return node;
        }
        // Node is bigger than the root.
        if(root.getValue() < node.getValue()) {
            node.setLeft(root);
            return node;
        }
        // Only one element in the tree.
        if (root.isLeaf()) {
            if (root.getValue() > node.getValue()) {
                root.setLeft(node);
                return root;
            } else {
                node.setLeft(root);
                return node;
            }
        } else {
            // If there are leafs.
        }
        return root;
    }
}

