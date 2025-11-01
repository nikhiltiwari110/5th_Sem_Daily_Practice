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
    public ListNode modifiedList(int[] nums, ListNode head) {

        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        while(set.contains(head.val)){
            head = head.next;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr!=null){
            if(set.contains(curr.val)){
                ListNode temp = curr.next;
                prev.next = temp;
                curr.next = null;
                curr = temp;
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}