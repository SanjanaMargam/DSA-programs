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
    public boolean isSubtree(TreeNode root, TreeNode subroot) {

        if(subroot==null) return true;
        if(root==null) return false;
        if(root.val==subroot.val){
            if(equal(root,subroot)) return true;
           
        }
        if(isSubtree(root.right,subroot)) return true;
       if( isSubtree(root.left,subroot)) return true;

       return false;

    }

    boolean equal(TreeNode root,TreeNode subroot){


        if(subroot==null && root==null) return true;

         if (root == null || subroot == null) return false;


        if(root.val!=subroot.val) return false;

        if(equal(root.right,subroot.right)==false) return false;

         if(equal(root.left,subroot.left)==false) return false;

         return true;




    }
}
