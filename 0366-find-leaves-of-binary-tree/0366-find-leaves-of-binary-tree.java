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
    public List<List<Integer>> findLeaves(TreeNode root) {
         List<List<Integer>> ans = new ArrayList<>();
        while(!isLeaf(root)){
            List<Integer> storeLeaves = new ArrayList<>();
            getAndDeleteLeaves(root, storeLeaves);
            ans.add(storeLeaves);
        }
        List<Integer> rVal= new ArrayList<>(List.of(root.val));
        ans.add(rVal);
        return ans;
    }
    private void getAndDeleteLeaves(TreeNode root, List<Integer> storeLeaves){
        if(root == null) return;
        if (isLeaf(root.left)) {
            storeLeaves.add(root.left.val);
            root.left = null;
        }
        if(isLeaf(root.right)){
            storeLeaves.add(root.right.val);
            root.right = null;
        }
        
        getAndDeleteLeaves(root.left, storeLeaves);
        getAndDeleteLeaves(root.right, storeLeaves);
        
    }
    public boolean isLeaf(TreeNode node){
        return (node != null) && node.left == null && node.right == null;
    }
}