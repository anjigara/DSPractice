package com.ds.leetcode.arraycoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class SumOfTwo {
  public static void main(String[] args) {
    int[] result = twoSum(new int[]{2, 7, 11, 15}, 22);
    System.out.println("Result:: " + Arrays.toString(result));
  }

  private static int[] twoSum(int[] ints, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < ints.length; i++) {
      if (map.containsKey(target - ints[i])) {
        result[0] = map.get(target - ints[i]);
        result[1] = i;
      }
      map.put(ints[i], i);
    }
    return result;
  }


}
