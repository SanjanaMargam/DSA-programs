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

    int ans=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {

        tree(root);


        return ans-1;
    }

    int tree(TreeNode root){


        
        if(root==null) return 0;

               int x= tree(root.left);

                int y=tree(root.right);

               ans= Math.max(ans,1+x+y);



                return 1+Math.max(x,y);

    }
}
