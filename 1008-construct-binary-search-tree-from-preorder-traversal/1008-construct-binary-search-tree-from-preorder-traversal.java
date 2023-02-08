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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int val : preorder){
            createTrees(root, val);
        }
        return root;
    }
    public TreeNode createTrees(TreeNode node, int val){
        if(node == null){
            TreeNode root = new TreeNode(val);
            return root;
        }
        if(node.val > val){
            node.left = createTrees(node.left, val);
        }
         else if(node.val < val){
             node.right = createTrees(node.right, val);
         }
        return node;
    }
}