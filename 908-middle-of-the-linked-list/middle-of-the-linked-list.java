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
    public ListNode middleNode(ListNode head) {
       //find size of the linkedlist
       int size = 0;
       ListNode temp = head;
       while(temp!=null){
        size++;
        temp = temp.next;
       }
       int index = size/2;
       int c = 0;
       ListNode nn = head;
       while(c<index){
        nn = nn.next;
        c++;
       }
       return nn; 
    }
}