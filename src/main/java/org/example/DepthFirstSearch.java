package org.example;

import java.util.*;

public class DepthFirstSearch {
    public static void dfs(int start, List<List<Integer>> adjList) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[adjList.size()];

        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.println(" node ====> " + node);
            if (!visited[node]) {
                visited[node] = true;


                for (int neighbor : adjList.get(node)) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(3);
        adjList.get(2).add(4);

        System.out.println("DFS starting from node 0:");
        dfs(0, adjList);
    }
}
