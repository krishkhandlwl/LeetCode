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
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getCount(root, list);
        int[] arr = new int[list.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
    Integer prev = null;
    int count =1;
    int max =0;
    public void getCount(TreeNode node, List<Integer> list){
        if(node == null) return;
        
        getCount(node.left, list);
        
        if(prev != null){
            if(prev == node.val){
                count++;
            }
            else count =1;
        }
        if(count> max){
            list.clear();
            list.add(node.val);
            max = count;
            
        }
        else if(count == max){
            list.add(node.val);
        }
        
        prev = node.val;
        getCount(node.right, list);
    }
}