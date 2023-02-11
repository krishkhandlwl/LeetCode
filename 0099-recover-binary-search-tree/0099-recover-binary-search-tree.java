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
    TreeNode prev = null;
    TreeNode first = null, second = null;
    public void recoverTree(TreeNode root) {
        checkValues(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
      
    }
    public void checkValues(TreeNode node){
        if(node ==null) return;
        
        checkValues(node.left);
        
        if(prev != null && node.val <= prev.val){
            if(first == null){
                first = prev;        
            }
            second = node; 
        }
        
        prev = node;
        
        checkValues(node.right);
        
    }
}