class Solution {
    public int climbStairs(int n) {




            int dp[]=new int[n];
            Arrays.fill(dp,-1);

        return climb(n,1,dp);
        
        
    }

    int climb(int n,int idx,int dp[]){

        if(idx>=n) return 1;
        

  if(dp[idx]!=-1) return dp[idx];



      dp[idx]= climb(n,idx+1,dp)+climb(n,idx+2,dp);

      return dp[idx];

        
    }
}
