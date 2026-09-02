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
    public List<Integer> rightSideView(TreeNode root) {




        List<Integer> l=new ArrayList<>();
        right(0,l,root);
        return l;
    }

    void right(int level,List<Integer> l,TreeNode root){

        if(root==null) return;

        if(l.size()==level){
            l.add(root.val);
        }
        right(level+1,l,root.right);
        right(level+1,l,root.left);
    }
}
