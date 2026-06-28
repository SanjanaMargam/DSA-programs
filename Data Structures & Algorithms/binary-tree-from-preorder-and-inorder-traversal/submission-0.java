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
    int pos=0;
    public TreeNode buildTree(int[] pre, int[] in) {

        
      return  build(pre,in,0,in.length-1);

         
        
    }

    TreeNode build(int[] pre,int[] in, int low,int h){

       if(low>h) return null;

            TreeNode root=new TreeNode(pre[pos]);

            int idx=lin(in,pre[pos]);
              pos++;
            root.left=build(pre,in, low,idx-1);

            root.right=build(pre,in,idx+1,h);

          
    
      return root;

    }

    int lin(int in[],int ele){

        for(int i=0;i<in.length;i++){
            if(in[i]==ele) return i;
        }

        return 0;
    }
}

