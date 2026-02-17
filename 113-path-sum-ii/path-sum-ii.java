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
    static List<List<Integer>> res;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        res = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        sum(root,targetSum,ll);
        return res;
    }
    public void sum(TreeNode root, int targetSum,List<Integer> ll){
        if(root == null) return;
        ll.add(root.val);
        if(root.left == null && root.right == null){
            if(targetSum - root.val == 0){
                res.add(new ArrayList<>(ll));
            }
        }
        sum(root.left,targetSum-root.val,ll);
        sum(root.right,targetSum-root.val,ll);
        ll.remove(ll.size()-1);
    }
}