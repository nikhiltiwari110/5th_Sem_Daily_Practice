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
    public boolean flag;
    public boolean isValidBST(TreeNode root) {
        flag = true;
        min(root);
        max(root);
        return flag;
    }
    public long min(TreeNode root){
        if(root == null) return Long.MAX_VALUE;
        long lmin = min(root.left);
        long rmin = min(root.right);
        if(root.val>=rmin) flag = false;
        return Math.min(root.val,Math.min(lmin,rmin));
    }
    public long max(TreeNode root){
        if(root == null) return Long.MIN_VALUE;
        long lmax = max(root.left);
        if(root.val<=lmax) flag = false;
        long rmax = max(root.right);
        return Math.max(root.val,Math.max(lmax,rmax));
    }
}