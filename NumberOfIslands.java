package Nuts;

public class NumberOfIslands {
	

	    public int numIslands(char[][] grid) {
	        if (grid == null || grid.length == 0) return 0;

	        int numIslands = 0;
	        int rows = grid.length;
	        int cols = grid[0].length;

	        // Traverse each cell
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                // If land is found
	                if (grid[i][j] == '1') {
	                    dfs(grid, i, j);
	                    numIslands++;  // Increase count
	                }
	            }
	        }

	        return numIslands;
	    }

	    // DFS to mark the whole island
	    private void dfs(char[][] grid, int i, int j) {
	        int rows = grid.length;
	        int cols = grid[0].length;

	        // Check for out-of-bounds or water
	        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0') {
	            return;
	        }

	        // Mark as visited
	        grid[i][j] = '0';

	        // Explore all four directions
	        dfs(grid, i + 1, j); // down
	        dfs(grid, i - 1, j); // up
	        dfs(grid, i, j + 1); // right
	        dfs(grid, i, j - 1); // left
	    }

	    // Example usage
	    public static void main(String[] args) {
	        NumberOfIslands solution = new NumberOfIslands();

	        char[][] grid = {
	            {'1','1','0','0','0'},
	            {'1','1','0','0','0'},
	            {'0','0','1','0','0'},
	            {'0','0','0','1','1'}
	        };

	        int result = solution.numIslands(grid);
	        System.out.println("Number of Islands: " + result);  // Output: 3
	    }
	}


