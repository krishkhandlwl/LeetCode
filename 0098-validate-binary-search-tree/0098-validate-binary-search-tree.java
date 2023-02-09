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
    private boolean flag = true;
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return flag;
    }
   public void inorder(TreeNode node){
       if(node == null) return;
       inorder(node.left);
       if(prev!= null && node.val <= prev.val){
           flag = false;
           return;
       }
       prev = node;
       inorder(node.right);
       
   }
}