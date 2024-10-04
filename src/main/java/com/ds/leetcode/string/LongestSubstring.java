package com.ds.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
  public static void main(String[] args) {
    String s1 = "abcabcbb";
    String s2 = "bbbbb";
    String s3 = "pwwkew";
    String s4 = "";
    String s5 = "dvdf";

    System.out.println(longestSubstring(s1)); //3
    System.out.println(longestSubstring(s2)); //1
    System.out.println(longestSubstring(s3)); // 3
    System.out.println(longestSubstring(s4)); // 0
    System.out.println(longestSubstring(s5)); // 3
  }

  private static int longestSubstring(String str) {
    if (str == null || str.length() == 0) {
      return 0;
    } else if (str.length() == 1) {
      return 1;
    }
    Map<Character, Integer> map = new HashMap<>(); //<key, value>
    int max = 0;
    for (int i = 0, j = 0; j < str.length(); j++) {
      if (map.containsKey(str.charAt(j))) {
        i = Math.max(map.get(str.charAt(j)), i);
      }
      max = Math.max(max, j - i + 1);
      map.put(str.charAt(j), j + 1);
    }
    return max;

    /*for (int j = 0; j < str.length(); j++) {
      if (map.containsKey(str.charAt(j))) {
        return map.size();
      } else {
        map.put(str.charAt(j), j);
      }

    }
    return map.size();*/
  }
}
