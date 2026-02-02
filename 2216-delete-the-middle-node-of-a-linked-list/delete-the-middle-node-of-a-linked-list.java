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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int pointer = 0;
        temp = head;
        ListNode prev = null;
        ListNode ne = null;
        while(temp != null){
            
            if(temp.next!=null){
                ne = temp.next;
            }else ne = null;
            
            if(pointer==(size/2 )){
                prev.next = ne;
            }
            
            prev = temp;
            temp = temp.next;
            pointer++;
        
        }
        return head;
    }
}