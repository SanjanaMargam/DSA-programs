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
    public List<List<Integer>> levelOrder(TreeNode root) {




        Queue<TreeNode> q=new LinkedList<>();

        
        List<List<Integer>> l=new ArrayList<>();


        if(root==null) return l;

        q.add(root);
        while(!q.isEmpty()){


            int size=q.size();

            List<Integer> l2=new ArrayList<>();

            for(int i=0;i<size;i++){

                TreeNode temp=q.poll();
                l2.add(temp.val);

                if(temp.left!=null)
                q.add(temp.left);

                if(temp.right!=null)
                q.add(temp.right);


            }

            l.add(new ArrayList<>(l2));
        }


        return l;
        
    }
}
