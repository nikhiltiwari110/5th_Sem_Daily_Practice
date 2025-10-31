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
      ListNode head = new ListNode();
      ListNode nn = new ListNode();
      head.next = nn;
      ListNode h1 = list1;
      ListNode h2 = list2;
      while(h1!=null&&h2!=null){
        if(h1.val<h2.val){
            nn.next = h1;
            h1 = h1.next;
        }else{
            nn.next = h2;
            h2 = h2.next;
        }
        nn = nn.next;
      }

      while(h1!=null){
        nn.next = h1;
        h1 = h1.next;
        nn = nn.next;
      }
      while(h2!=null){
        nn.next = h2;
        h2 = h2.next;
        nn = nn.next;
      }
        return head.next.next;
    }
}