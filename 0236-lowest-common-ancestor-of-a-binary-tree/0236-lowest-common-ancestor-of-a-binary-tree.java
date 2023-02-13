/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root == p || root ==q){
            return root;
        }
        
        TreeNode l = lowestCommonAncestor(root.left, p,q);
        TreeNode r = lowestCommonAncestor(root.right, p,q);
        
        if(l != null && r != null){
            return root;
        }
        else{
            return (l!=null)?l:r;
        }
    }
}
/*
class Solution {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> p1 = new ArrayList<>();
        ArrayList<TreeNode> p2 = new ArrayList<>();
        path(root, p, p1);
        path(root, q, p2);
        int i = 0;
        while(i<p1.size() && i<p2.size() && p1.get(i) == p2.get(i)){
            i++;
        }
        return p1.get(i-1);
    }
    public boolean path(TreeNode root, TreeNode node, ArrayList<TreeNode> list){
        if(root == null) return false;
        list.add(root);
        if(root == node) return true;
        if(path(root.left, node, list) || path(root.right, node, list)){
            return true;
        }
        list.remove(list.size()-1);//Taaki faltu chars na store ho :P
        return false;
    }   
}*/