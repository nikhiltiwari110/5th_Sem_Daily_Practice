/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = rec(nums,0,nums.length-1);
        return root;
    }
    public TreeNode rec(int [] nums,int lo, int hi){
        if(lo>hi) return null;
        int mid = (lo + hi)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = rec(nums,lo,mid-1);
        node.right = rec(nums,mid+1,hi);
        return node;
    }
}