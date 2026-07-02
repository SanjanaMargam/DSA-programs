class Solution {
    public int rob(int[] a) {

        int dp[]=new int[a.length];

        Arrays.fill(dp,-1);

     return   roby(a,0,dp);
        
    }

    int roby(int a[],int idx,int dp[]){


        if(idx>=a.length) return 0;
  if(dp[idx]!=-1) return dp[idx];

       int ref= roby(a,idx+2,dp);
       
       ref= roby(a,idx+2,dp)+a[idx];
       
       

      int l=  roby(a,idx+1,dp);

          dp[idx]=Math.max(ref,l);

        return dp[idx];
    }
}
