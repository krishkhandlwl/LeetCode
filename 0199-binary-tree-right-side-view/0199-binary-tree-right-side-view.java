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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        rightValues(root, ans, 0);
        return ans;
    }
    public void rightValues(TreeNode node, List<Integer> ans, int height){
        if(node == null){
            return;
        }
        if(height == ans.size()){
        ans.add(node.val);
        }
        rightValues(node.right, ans, height +1);
        rightValues(node.left, ans, height +1);
        
    }
}