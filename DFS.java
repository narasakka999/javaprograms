package Nuts;

import java.util.*;

public class DFS {

    // Method to perform DFS traversal
    public static void dfs(int vertex, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        // Mark the current vertex as visited
        visited.add(vertex);
        
        // Print the current vertex
        System.out.print(vertex + " ");
        
        // Recursively visit all the adjacent vertices
        for (int neighbor : graph.get(vertex)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, graph, visited);
            }
        }
    }

    public static void main(String[] args) {
        // Create a graph as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        // Adding edges to the graph (Undirected graph)
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 4));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(1, 2));
        
        // Set to track visited nodes
        Set<Integer> visited = new HashSet<>();
        
        // Perform DFS starting from vertex 0
        System.out.println("Depth-First Search (DFS) starting from vertex 0:");
        dfs(0, graph, visited);
    }
}


	


