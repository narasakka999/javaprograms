package Nuts;

import java.util.*;

public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        backtrack(solutions, board, 0, n);
        return solutions;
    }

    private void backtrack(List<List<String>> solutions, char[][] board, int row, int n) {
        // Base case: placed all queens
        if (row == n) {
            solutions.add(construct(board));
            return;
        }

        // Try placing a queen in each column of this row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';             // Place queen
                backtrack(solutions, board, row + 1, n);  // Go to next row
                board[row][col] = '.';             // Backtrack
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();
        for (char[] row : board) {
            path.add(new String(row));
        }
        return path;
    }

    public static void main(String[] args) {
        NQueens solver = new NQueens();
        int n = 4;
        List<List<String>> results = solver.solveNQueens(n);

        System.out.println("Solutions for " + n + "-Queens:");
        for (List<String> board : results) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
