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
    private int sum;
    public int sumOfLeftLeaves(TreeNode node) {
        if(node == null) return 0;
        
        if(node.left!= null && node.left.left == null && node.left.right == null){
            sum += node.left.val;
        }
        
        sumOfLeftLeaves(node.left);
        sumOfLeftLeaves(node.right);
        
        return sum;
    }
}