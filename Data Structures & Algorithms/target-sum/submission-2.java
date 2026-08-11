class Solution {
    public int findTargetSumWays(int[] a, int k) {


        


        int total=0;

        for(int i=0;i<a.length;i++)
        total+=a[i];

int dp[][]=new int[a.length][total+ total +1];
        if(k>total || k<-total ) return 0;

        for(int i=0;i<a.length;i++){
            Arrays.fill(dp[i],-1);
        }
      return   fun(a,k,0,0,dp,total);
        
    }

    int fun(int a[],int k,int idx,int sum,int dp[][],int total){

       

 
        if(idx==a.length){
            if(sum==k) return 1;
            return 0;
        }

        if(dp[idx][sum+total]!=-1) return dp[idx][sum+total];

        int tak=fun(a,k,idx+1,sum-a[idx],dp,total);
        int add=fun(a,k,idx+1,sum+a[idx],dp,total);
        dp[idx][sum+total]=tak+add;

        return tak+add;
    }
}
