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
      List<List<Integer>> res;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      res = new ArrayList<>();
      if(root==null) return res;
      List<Integer> ll = new ArrayList<>();
      rec(root,targetSum,ll);
      return res;
    }
    public void rec(TreeNode root,int targetSum,List<Integer> ll){
        if(root == null) return;
        ll.add(root.val);
        if(root.left==null && root.right==null&&targetSum - root.val==0){
            res.add(new ArrayList<>(ll));
        }
        rec(root.left,targetSum-root.val,ll);
        rec(root.right,targetSum-root.val,ll);
        ll.remove(ll.size()-1);

        
    } 
}