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
    static long totalsum;
    static long product;
    public int maxProduct(TreeNode root) {
        product=0;
        totalsum=0;
        totalsum = sum(root);
        sum2(root);
        return (int)(product%1000000007);
    }
    public long sum(TreeNode root){
        if(root == null) return 0;
        long l = sum(root.left);
        long r = sum(root.right);
        return l + r + root.val;

    }
    public long sum2(TreeNode root){
        if(root == null) return 0;
        long l = sum2(root.left);
        long r = sum2(root.right);
        long subtreesum =  l + r + root.val;
        long p = subtreesum*(totalsum-subtreesum);
        product = Math.max(p,product);
        return subtreesum;
    }
}