/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode start = null;
        ListNode ptr = null;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                if (start == null) {
                    start = list1;
                    ptr = list1;
                } else {
                    ptr.next = list1;
                    ptr = list1;
                }
                list1 = list1.next;
            } else {
                if (start == null) {
                    start = list2;
                    ptr = list2;
                } else {
                    ptr.next = list2;
                    ptr = list2;
                }
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            if (ptr == null) {
                start = list1;
            } else {
                ptr.next = list1;
            }
        } else if (list2 != null) {
            if (ptr == null) {
                start = list2;
            } else {
                ptr.next = list2;
            }
        }
        return start;
    }
}