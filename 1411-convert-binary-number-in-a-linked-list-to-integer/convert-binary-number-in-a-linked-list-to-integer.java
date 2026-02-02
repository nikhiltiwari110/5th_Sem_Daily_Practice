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
    public int getDecimalValue(ListNode head) {
        String num = "";
        ListNode temp = head;
        while(temp!=null){
            num+=temp.val;
            temp = temp.next;
        }
        int sum = 0;
        int pow = num.length()-1;
        for(int i = 0; i < num.length();i++){
            int x = num.charAt(i) - '0';
            sum += x * Math.pow(2,pow);
            pow--;
        }
        return sum;
    }
}