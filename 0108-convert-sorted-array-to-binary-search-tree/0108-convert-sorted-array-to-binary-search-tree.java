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
    public TreeNode construct(int[] nums, int lo, int hi){
        if(lo > hi){
            return null;
        }
        int mid = (lo + hi)/2;
        TreeNode node = new TreeNode();
        node.val = nums[mid];
        node.left = construct(nums, lo, mid-1);
        node.right = construct(nums, mid+1, hi);
        
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = construct(nums, 0, nums.length-1);
        return root;
    }
}