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
    StringBuffer str = new StringBuffer();
    public String tree2str(TreeNode root) {
        preorder(root);
        return str.toString();
    }
    public void preorder(TreeNode node){
        if(node == null) return;
        str.append(node.val);
        if(node.left!= null || node.right != null){
             str.append("(");
            preorder(node.left);
             str.append(")");
        }
        if(node.right != null){
             str.append("(");
            preorder(node.right);
             str.append(")");
        }
    }
}