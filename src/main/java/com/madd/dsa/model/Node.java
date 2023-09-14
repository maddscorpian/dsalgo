package com.madd.dsa.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Node {
    private final int value;
    private Node left = null;
    private Node right = null;

    public boolean isLeaf() {
        return (left == null) && (right == null);
    }
}
