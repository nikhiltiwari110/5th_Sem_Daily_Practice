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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode listb = slow.next;
        slow.next = null;
        //reverse(listb);
        ListNode curr = listb;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        //head of listb = prev
        //merge head and prev
        ListNode dummy = head;
        while(dummy!=null&&prev!=null){
            ListNode dn = dummy.next;
            ListNode pn = prev.next;
            dummy.next = prev;
            prev.next = dn;
            prev = pn;
            dummy = dn;
        }
    }
}