package org.example.binaryTree;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapAndTreeSetExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Cherry", 3);
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);

        System.out.println("TreeMap: " + treeMap);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);

        System.out.println("TreeSet: " + treeSet);
    }
}
