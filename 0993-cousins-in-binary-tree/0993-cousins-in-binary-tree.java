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
    //BFS Approach
    public boolean isCousins(TreeNode root, int x, int y) {
        int xHeight = -1;
        int yHeight = -2;
        int height =0;
        Queue<TreeNode> mainQ = new ArrayDeque<>();
        mainQ.add(root);
        while(mainQ.size() > 0){
            int size = mainQ.size();
            for(int i=0; i<size; i++){
                TreeNode node = mainQ.remove();
                if(node.left!= null && node.right != null){
                if((node.left.val == x && node.right.val ==y) || (node.left.val == y && node.right.val == x))                   return false;
                }
                if(node.val == x){
                    xHeight = height;
                }
                if(node.val == y){
                    yHeight = height;
                }
                if(node.left!= null) { mainQ.add(node.left);  }
                if(node.right!= null) { mainQ.add(node.right);  }    
            }
            height++;
        }
        
        return xHeight == yHeight;
    }
}