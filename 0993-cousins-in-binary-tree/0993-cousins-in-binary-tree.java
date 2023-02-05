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
    int xDepth =-1;
    int yDepth = -2;
    TreeNode xParent = null;
    TreeNode yParent = null;

    public boolean isCousins(TreeNode root, int x, int y) {
        getHeightParent(root, x, y, null, 0);
        return xDepth == yDepth && xParent != yParent;
    }
    public void getHeightParent(TreeNode node, int x, int y, TreeNode parent, int height){
        
        if(node == null) return;
        if(node.val == x){
            xDepth = height;
            xParent = parent;
        }
        if(node.val == y){
            yDepth = height;
            yParent = parent;
        }
        parent = node;
        
        getHeightParent(node.left, x, y, parent, height+1);
        getHeightParent(node.right, x, y, parent, height+1);
        
    }
}