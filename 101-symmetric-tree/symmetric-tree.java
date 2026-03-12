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
    public boolean isSymmetric(TreeNode root) {
        return isit(root.left,root.right);
    }
    public boolean isit(TreeNode root1, TreeNode root2){
        if(root1==null && root2 == null) return true;
        if(root1==null||root2==null) return false;
        if(root1.val!=root2.val) return false;
        boolean l = isit(root1.left,root2.right);
        boolean r = isit(root1.right,root2.left);
        return l&r;
    }
}