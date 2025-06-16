package Nuts;

import java.util.*;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort the intervals based on the starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Traverse and merge
        int[] current = intervals[0];
        merged.add(current);

        for (int[] interval : intervals) {
            int currentStart = current[0];
            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= currentEnd) {
                // Overlapping intervals, merge them
                current[1] = Math.max(currentEnd, nextEnd);
            } else {
                // Non-overlapping interval, add to list
                current = interval;
                merged.add(current);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    // Example usage
    public static void main(String[] args) {
        MergeIntervals solution = new MergeIntervals();

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] result = solution.merge(intervals);

        System.out.print("Merged Intervals: ");
        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval) + " ");
        }
        // Output: [1, 6] [8, 10] [15, 18]
    }
}
