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

    boolean ans=true;
    public boolean isBalanced(TreeNode root) {



           return   tree(root)==-1 ? false : true;

             


        
    }

    int tree(TreeNode root){

        if(root==null) return 0;

       int x= tree(root.right);

       if(x==-1) return -1;
       int y= tree(root.left);

       if(y==-1) return -1;

       if(Math.abs(x-y)>1) return -1;

       

       return 1+Math.max(x,y);





        
 
    }
}
