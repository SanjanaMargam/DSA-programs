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
    public int goodNodes(TreeNode root) {


        
       return good(root,root.val);
        
        
    }
    int good(TreeNode root,int maxi){

        if(root==null) return 0;

        int c=0;

        if(root.val>=maxi){
            c=1;
            maxi=root.val;
        }
       c+= good(root.right,maxi);
        c+=good(root.left,maxi);

        return c;
    }
}
