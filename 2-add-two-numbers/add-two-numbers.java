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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start=null;
        ListNode ptr=null;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0)
        {
            int v1=0;
            int v2=0;
            if(l1!=null)
            {
                v1=l1.val;
            }
            if(l2!=null)
            {
                v2=l2.val;
            }
            int sum=v1+v2+carry;
            int digit=sum%10;
            carry=sum/10;
            ListNode newnode=new ListNode(digit);
            if(start==null)
            {
                start=newnode;
                ptr=newnode;
            }
            else
            {
                ptr.next=newnode;
                ptr=newnode;
            }
            if(l1!=null)
            {
                l1=l1.next;
            }
            if(l2!=null)
            {
                l2=l2.next;
            }
        }
        return start;
    }
}