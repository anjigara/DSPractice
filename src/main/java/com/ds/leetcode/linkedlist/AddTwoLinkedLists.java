package com.ds.leetcode.linkedlist;

public class AddTwoLinkedLists {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);
    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    AddTwoLinkedLists addTwoLinkedLists = new AddTwoLinkedLists();
    ListNode result = addTwoLinkedLists.addTwoNumbers(l1, l2);
    while (result != null) {
      System.out.println(result.val);
      result = result.next;
    }

  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    return calculate(l1, l2, 0);
  }

  ListNode calculate(ListNode l1, ListNode l2, int carry) {
    if (l1 == null && l2 == null && carry == 0) return null;
    if (l1 == null && l2 == null && carry != 0) return new ListNode(1);
    int temp = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
    ListNode result = new ListNode(temp % 10);
    result.next = calculate(l1 == null ? null : l1.next, l2 == null ? null : l2.next, temp / 10);
    return result;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}
