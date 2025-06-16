package Nuts;

import java.util.*;

public class SimpleBFS {
    
    // Method to perform BFS traversal
    public static void bfs(int startVertex, Map<Integer, List<Integer>> graph) {
        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        
        // Set to track visited nodes
        Set<Integer> visited = new HashSet<>();
        
        // Enqueue the starting vertex and mark it as visited
        queue.offer(startVertex);
        visited.add(startVertex);
        
        // BFS traversal
        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue
            int vertex = queue.poll();
            
            // Print the current vertex
            System.out.print(vertex + " ");
            
            // Get all the adjacent vertices of the current vertex
            for (int neighbor : graph.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    // If the neighbor hasn't been visited, mark it and enqueue it
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
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
        
        // Perform BFS starting from vertex 0
        System.out.println("Breadth-First Search (BFS) starting from vertex 0:");
        bfs(0, graph);
    }
}

		
		

