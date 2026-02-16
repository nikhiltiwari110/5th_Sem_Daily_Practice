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
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return new ArrayList<>();
        q.add(root);
        int l = 0;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> ll = new ArrayList<>();
            for(int i = 1; i <= size; i++){
                TreeNode rv = q.poll(); 
                ll.add(rv.val);
                if(rv.left!=null) q.add(rv.left);
                if(rv.right!=null) q.add(rv.right);
            }
            res.add(ll);
        }
        return res;
    }
}