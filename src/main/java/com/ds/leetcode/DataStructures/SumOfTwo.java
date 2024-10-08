package com.ds.leetcode.DataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */

public class SumOfTwo {
  public static void main(String[] args) {
    //Option-1
    int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
    System.out.println("Result:: " + Arrays.toString(result));
    //Option-2
    int[] result1 = twoSumWithMap(new int[]{3, 2, 4}, 7);
    System.out.println("Map Result:: " + Arrays.toString(result1));
  }

  /**
   * This method complexity is O(n)
   * @param ints
   * @param target
   * @return
   */
  private static int[] twoSumWithMap(int[] ints, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] result = new int[2];
    for (int i = 0; i < ints.length; i++) {
      if (map.containsKey(target - ints[i])) {
        result[0] = map.get(target - ints[i]);
        result[1] = i;
      }
      map.put(ints[i], i);
    }
    return result;
  }


  /**
   * This method complexity is O(n^2)
   * @param nums
   * @param target
   * @return
   */
  public static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    return result;
  }

}
