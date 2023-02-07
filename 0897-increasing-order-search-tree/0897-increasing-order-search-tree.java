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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        TreeNode node = new TreeNode(0);
        TreeNode curr = node;
          
        
        for(int val : ans){
            curr.right = new TreeNode(val);
            curr = curr.right;
        }
        return node.right;
            
    }
    public void inorder(TreeNode node, ArrayList<Integer> ans){
        if(node == null) return;
        inorder(node.left, ans);
        ans.add(node.val);
        inorder(node.right, ans);
        
    }
}