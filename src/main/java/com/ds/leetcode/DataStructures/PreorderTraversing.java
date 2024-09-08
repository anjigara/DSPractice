package com.ds.leetcode.DataStructures;

public class PreorderTraversing {
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.right.left = new Node(5);
    root.right.right = new Node(6);
    root.right.left.left = new Node(7);
    root.right.left.right = new Node(8);
    PreorderTraversing preorderTraversing = new PreorderTraversing();
    preorderTraversing.preOrder(root);
  }

  /**
   *
   * @param root
   */
  private void preOrder(Node root) {
    if (root == null) {
      return ;
    }
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
  }
}
