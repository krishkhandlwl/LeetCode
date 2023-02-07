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
        Integer prev = null, diff;
    public int minDiffInBST(TreeNode root) {
        diff = Integer.MAX_VALUE;
        inorder(root);
        return diff;
    }
    public void inorder(TreeNode node){
        if(node == null) return;
        inorder(node.left);
        if(prev!= null){
            diff = Math.min(diff, node.val - prev);
        }
        
        prev = node.val;
        inorder(node.right);
        
    }
}