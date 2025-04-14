package Interval_Based_qns;

import java.util.ArrayList;
import java.util.List;

public class Inser_Interval {
    public static void main(String[] args) {

        int intervals[][] = {{1, 3}, {6, 9}};
        int newInterval[] = {2, 5};

        System.out.println(insert(intervals, newInterval));
    }
    
    public static  int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> ans = new ArrayList<>();
        int i = 0;

        // Step 1: Add all intervals that end before newInterval starts
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }

        // Step 2: Merge all overlapping intervals with newInterval
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        // Add the merged interval
        ans.add(newInterval);

        // Step 3: Add all the rest of the intervals
        while (i < intervals.length) {
            ans.add(intervals[i]);
            i++;
        }

        // Convert List to 2D array
        return ans.toArray(new int[ans.size()][]);
    }
    
}
