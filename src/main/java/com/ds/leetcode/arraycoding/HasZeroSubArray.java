package com.ds.leetcode.arraycoding;

import java.util.HashSet;
import java.util.Set;

public class HasZeroSubArray {
  public static void main(String[] args) {

    System.out.println(hasZeroSubArray(new int[]{ 4, -6, 3, -1, 4, 2, 7 }));

  }

  /**
   *
   * @param ints
   * @return
   */
  private static boolean hasZeroSubArray(int[] ints) {

    /*for (int i = 0; i < ints.length; i++) {
      int sum = 0;
      for (int j = i; j < ints.length; j++) {
        sum += ints[j];
        if (sum == 0) {
          return true;
        }
      }
    }*/
    int sum =0;
    Set<Integer> set = new HashSet<>();
    for (int num : ints) {
      sum += num;
      if (set.contains(sum)) {
        System.out.println("Num value:: " + num+" Sum:: "+sum);
        return true;
      }
      set.add(sum);
    }
    return false;
  }
}
