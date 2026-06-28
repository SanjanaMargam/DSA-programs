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


        return ans-2;
    }

    int tree(TreeNode root){


        
        if(root==null) return 0;

               int x= 1+tree(root.left);

                int y=1+tree(root.right);

               ans= Math.max(ans,x+y);



                return Math.max(x,y);

    }
}
