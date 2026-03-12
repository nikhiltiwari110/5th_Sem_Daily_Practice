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
    public List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>> ans = new ArrayList<>();
     if(root == null) return ans;
     Queue<TreeNode> q = new LinkedList<>();
     q.add(root);
     while(!q.isEmpty()){
        int sz = q.size();
        List<Integer> ll = new ArrayList<>();
        for(int i = 0; i < sz; i++){
            TreeNode tp = q.poll();
            if(tp.left!=null) q.add(tp.left);
            if(tp.right!=null) q.add(tp.right);
            ll.add(tp.val);
        }
        ans.add(ll);
     }   
     return ans;
    }
}