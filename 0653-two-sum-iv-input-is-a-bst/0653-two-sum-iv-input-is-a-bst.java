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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        inOrder(root, ans);
        int lo = 0, hi =ans.size()-1;
        
        while(lo <hi){
            int left = ans.get(lo);
            int right = ans.get(hi);
            if(left + right == k){
                return true;
            }
            else if(left + right > k){
                hi--;
            }
            else{
                lo++;
            }
        }
        return false;
    }
    
    public void inOrder(TreeNode node, ArrayList<Integer> ans){
        if(node == null) return;
        inOrder(node.left, ans);
        ans.add(node.val);
        inOrder(node.right, ans);
    }
}