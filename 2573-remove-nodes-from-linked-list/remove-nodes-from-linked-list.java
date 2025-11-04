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
    public ListNode removeNodes(ListNode head) {
        //Make the linkedlist with reverse order 
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = null;
        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        //prev new head of the Linked List;
        ListNode max = prev;
        temp = prev.next;
        while(temp!=null){
            if(temp.val>=max.val){
                max.next = temp;
                max = max.next;
            }else{
                max.next = null;
            }
            temp = temp.next;
        }
        max.next = null;
        // reverse the linkedlist
        curr = prev;
        prev = null;
        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}