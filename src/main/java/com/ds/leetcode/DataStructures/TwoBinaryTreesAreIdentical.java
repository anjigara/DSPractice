package com.ds.leetcode.DataStructures;

public class TwoBinaryTreesAreIdentical {
  public static void main(String[] args) {
    Node x = new Node(1);
    x.left = new Node(2);
    x.right = new Node(3);
    Node y = new Node(1);
    y.left = new Node(2);
    y.right = new Node(3);
    System.out.println(twoBinaryTreesAreIdentical(x, y));
  }

  /**
   * @param x
   * @param y
   * @return
   */
  private static boolean twoBinaryTreesAreIdentical(Node x, Node y) {
    if (x == null && y == null) {
      return true;
    }
    if (x == null || y == null) {
      return false;
    }
    return (x.data == y.data) && twoBinaryTreesAreIdentical(x.left, y.left) && twoBinaryTreesAreIdentical(x.right, y.right);
  }
}
