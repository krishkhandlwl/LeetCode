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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode node = getMaxBT(nums, 0, nums.length);
        return node;
    }
    public TreeNode getMaxBT(int[] nums, int lo, int hi){
        if(lo == hi) return null;
        int ind_max = getMax(nums, lo, hi);
        TreeNode node = new TreeNode();
        node.val = nums[ind_max];
        node.left = getMaxBT(nums, lo, ind_max);
        node.right = getMaxBT(nums, ind_max + 1, hi);
        return node;
    }
     
    public int getMax(int[] arr,int lo,int hi){
        int max_i= lo;
        for(int i=lo; i<hi; i++){
            if(arr[max_i] < arr[i]){
                max_i= i;
            }
        }
        return max_i;
    }
}