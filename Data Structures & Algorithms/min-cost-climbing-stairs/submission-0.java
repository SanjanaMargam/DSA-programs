class Solution {
    public int minCostClimbingStairs(int[] cost) {

    
int n=cost.length;
            int dp[]=new int[n];
            Arrays.fill(dp,-1);

        return Math.min(climb(n,0,dp,cost),climb(n,1,dp,cost))-1;        
        
    }

    int climb(int n,int idx,int dp[],int cost[]){

        if(idx>=n) return 1;
        

  if(dp[idx]!=-1) return dp[idx];
 

 int lef= climb(n,idx+1,dp,cost)+cost[idx];
 int r=cost[idx]+climb(n,idx+2,dp,cost);


      dp[idx]=Math.min(lef,r);

      return dp[idx];

  
        
    }
}
