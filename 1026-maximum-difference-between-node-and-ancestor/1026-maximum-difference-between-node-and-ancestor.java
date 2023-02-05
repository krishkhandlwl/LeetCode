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
    public int maxAncestorDiff(TreeNode root) {
        int max = getMax(root, root.val, root.val);
        return max;
    }
    public int getMax(TreeNode node, int currMax, int currMin){
        if(node == null){
            return currMax - currMin;
        }
         currMax = Math.max(node.val, currMax);
         currMin = Math.min(node.val, currMin);
        
        int left_gap = getMax(node.left, currMax, currMin);
        int right_gap = getMax(node.right, currMax, currMin);
        
        return Math.max(left_gap, right_gap);
        
    }
}