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
    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
      
        Queue<TreeNode> mainQ = new ArrayDeque<>();
        mainQ.add(root);
        
        while(!mainQ.isEmpty()){
            
            int size = mainQ.size();
              boolean flag = false;
            for(int i=0;i<size; i++){
                TreeNode temp = mainQ.poll();
                if(flag){
                    return temp;    
                }
                if(temp.val == u.val){
                    flag = true;
                }
                
                if(temp.left!= null){
                    mainQ.add(temp.left);
                }
                if(temp.right!= null){
                      mainQ.add(temp.right);
                }
            }
        }
        return null;
    }
}