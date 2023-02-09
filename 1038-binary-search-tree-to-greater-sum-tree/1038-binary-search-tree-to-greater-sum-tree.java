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
    int sum =0;
    public TreeNode bstToGst(TreeNode root) {
        postorder(root);
        return root;
    }
    public void postorder(TreeNode node){
        if(node == null) return;
        
        postorder(node.right);
        
        int val = node.val;
        sum += val;
        node.val = sum;
        
        postorder(node.left);
        
        
    }
    
}