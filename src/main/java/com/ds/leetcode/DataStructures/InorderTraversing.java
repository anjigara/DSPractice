package com.ds.leetcode.DataStructures;

public class InorderTraversing {
  public static void main(String[] args) {

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.right.left = new Node(5);
    root.right.right = new Node(6);
    root.right.left.left = new Node(7);
    root.right.left.right = new Node(8);
    InorderTraversing inTraversal = new InorderTraversing();
    inTraversal.inOrder(root);
  }

  /**
   *
   * @param root
   */
  private void inOrder(Node root) {
    if (root == null) {
      return ;
    }
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
  }

}
