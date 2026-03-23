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
    public int rob(TreeNode root) {
        int [] result = solveDp(root);
        return Math.max(result[0],result[1]);
    }
    public int [] solveDp(TreeNode root){
        if(root == null) {
            return new int[] {0,0};
        }
        int [] leftresult = solveDp(root.left);
        int [] rightresult = solveDp(root.right);
        int [] currentresult = new int[2];
        currentresult[0] = Math.max(leftresult[0],leftresult[1])+Math.max(rightresult[0],rightresult[1]);
        currentresult[1] = root.val + leftresult[0] + rightresult[0]; 
        return currentresult;
    }
}