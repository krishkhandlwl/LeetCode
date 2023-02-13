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
    public int goodNodes(TreeNode root) {
        getGoodNodes(root, Integer.MIN_VALUE);
        return count;
    }
    int count = 0;
    public void getGoodNodes(TreeNode node,int max_value){
        if(node == null) return ;

        if(node.val >= max_value){
            count++;
            max_value = node.val;
        }
        getGoodNodes(node.left, max_value);
        getGoodNodes(node.right, max_value);
    }
    
}