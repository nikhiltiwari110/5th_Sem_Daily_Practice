/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q) return root;
        boolean pinsubtree = check(root.left,p);
        boolean qinsubtree = check(root.left,q);
        if(pinsubtree&&qinsubtree){
            return lowestCommonAncestor(root.left,p,q);
        }else if(!pinsubtree&&!qinsubtree){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
        }
    }
    public boolean check(TreeNode root, TreeNode target){
        if(root == null) return false;
        if(root == target) return true;
        boolean l = check(root.left,target);
        boolean r = check(root.right,target);
        return l || r;
    }
}