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
    double closeDiff;
    public int closestValue(TreeNode root, double target) {
        int close = root.val;
         closeDiff = Math.abs(root.val - target);
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        for(int val: list){
            double d = Math.abs(val - target);
            if(d < closeDiff){
                close = val;
                closeDiff = d;
            }
        }
        return close;
    }
    public void inorder(TreeNode node, List<Integer> ans){
        if(node == null) return;
        inorder(node.left, ans);
        
        ans.add(node.val);
        
        inorder(node.right, ans);
        
    }
}