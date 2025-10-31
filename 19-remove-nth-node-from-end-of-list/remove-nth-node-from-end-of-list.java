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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //find size of the linkedlist
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        if(n==1&&head.next==null) return null;
        if(size == n) return head.next;
        int c = 0;
        temp = head;
        while(c<size-n-1){
            c++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}