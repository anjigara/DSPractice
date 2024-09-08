package com.ds.leetcode.string;

import java.util.Scanner;

public class LastWordCount {
  public static void main(String[] args) {

    System.out.println("Enter the input words");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("Input is::"+str);
    System.out.println("Last Word count is :: " + lastWordCount(str));

  }

  /**
   * This method calculates the count of the last word in the input string.
   *
   * @param str the input string
   * @return the count of the last word in the input string
   */
  private static int lastWordCount(String str) {
    // Trim the input string to remove leading and trailing whitespaces
    String inputWords = str.trim();
    int count = 0;

    // Iterate through the characters of the trimmed input string
    for (int i = 0; i < inputWords.length(); i++) {
      // Check if the character is a space
      if (inputWords.charAt(i) == ' ') {
        // Reset the count if a space is encountered
        count = 0;
      } else {
        // Increment the count for non-space characters
        count++;
      }
    }
    return count;
  }
}
