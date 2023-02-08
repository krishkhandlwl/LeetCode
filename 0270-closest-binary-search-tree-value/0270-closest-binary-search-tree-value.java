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
    int min =0;
    double minDiff = Double.MAX_VALUE;
    public int closestValue(TreeNode root, double target) {
        if(root == null) return 0;
        
        helper(root, target);
        return min;
    }
    
    
    public void helper(TreeNode node, double target){
        if(node == null) return;
        double d = Math.abs(node.val - target);
        if(d < minDiff){
            min = node.val;
            minDiff = d;
        }
        
        
        helper(node.left, target);
        helper(node.right, target);
    }
}