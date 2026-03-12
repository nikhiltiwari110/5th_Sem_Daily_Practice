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
    public int maxd=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        rec(root);
        return maxd;
    }
    public int rec(TreeNode root){
        if(root == null) return 0;
        int l = rec(root.left);
        int r = rec(root.right);
        int lr = Math.max(0,Math.max(l,r));
        int path = lr + root.val;
        int mpath = l + r + root.val;
        maxd = Math.max(maxd,Math.max(path,mpath));
        return path;
    }
}