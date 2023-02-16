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
    String str = "";
    public String tree2str(TreeNode root) {
        preorder(root);
        return str;
    }
    public void preorder(TreeNode node){
        if(node == null) return;
        str += node.val;
        if(node.left!= null || node.right != null){
            str += "(";
            preorder(node.left);
            str += ")";
        }
        if(node.right != null){
            str += "(";
            preorder(node.right);
            str += ")";
        }
    }
}