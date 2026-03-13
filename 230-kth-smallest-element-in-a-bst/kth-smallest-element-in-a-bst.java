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
    public int c;
    public int value;
    public int kthSmallest(TreeNode root, int k) {
        c =0;
        value = 0;
        inorder(root,k);
        return value;
    }
    public void inorder(TreeNode root,int k) {
        if(root == null) return;
        inorder(root.left,k);
        c++;
        if(c==k){
            value = root.val;
        }
        inorder(root.right,k);

    }
}