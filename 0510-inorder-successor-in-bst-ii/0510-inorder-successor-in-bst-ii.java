/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node inorderSuccessor(Node node) {
        if(node.right!= null){
            node = node.right;
            // until we get a non null left, we will keep calling the left child.
            
            while(node.left != null){
                node = node.left;
            }
            //returning the next node in inorder sequence....
            return node;
        }
        
        while(node.parent != null && node.parent.right == node){
            node = node.parent;
        }
        return node.parent;
    }
}