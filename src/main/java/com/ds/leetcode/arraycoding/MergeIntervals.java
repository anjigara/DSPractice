package com.ds.leetcode.arraycoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

  public static void main(String[] args) {
    int[][] intervals = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
    int[][] newSize = merge(intervals);
    System.out.print("The Merged Intervals are: ");
    for (int i = 0; i < newSize.length; i++) {
      System.out.print("[" + newSize[i][0] + ", " + newSize[i][1] + "] ");
    }
  }

  /**
   * This method complexity is O(nlogn)
   * @param intervals
   * @return
   */
  public static int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    int st = intervals[0][0], ed = intervals[0][1];
    List<int[]> ans = new ArrayList<>();
    for (int i = 1; i < intervals.length; ++i) {
      int s = intervals[i][0], e = intervals[i][1];
      if (ed < s) {
        ans.add(new int[] {st, ed});
        st = s;
        ed = e;
      } else {
        ed = Math.max(ed, e);
      }
    }
    ans.add(new int[] {st, ed});
    return ans.toArray(new int[ans.size()][]);
  }
}
