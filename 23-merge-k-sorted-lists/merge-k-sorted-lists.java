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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 1) return lists[0];
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val); 
        for(ListNode l : lists){
            if(l!=null)
            pq.add(l);
        }
        ListNode dummy = new ListNode(-1);
        ListNode copy = dummy;
        while(!pq.isEmpty()){
            ListNode d = pq.poll();
            copy.next = d;
            if(d.next!=null){
                pq.add(d.next);
            }
            copy = copy.next;
        }
        return dummy.next;
    }
}