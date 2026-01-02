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
    public int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diam_dfs(root);
        return diameter;
    }
    public int diam_dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left_dia = diam_dfs(root.left);
        int right_dia = diam_dfs(root.right);
        diameter = Math.max(diameter,left_dia+right_dia);
        int h = Math.max(left_dia,right_dia) +1;
        return h;
    }
}