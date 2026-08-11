class Solution {
    public int change(int amt, int[] a) {



        int dp[][]=new int[a.length][amt+1];

        for(int i=0;i<a.length;i++){
            Arrays.fill(dp[i],-1);
        }


       return  fun(amt,0,a,0,dp);
        
    }

    int fun(int amt,int idx,int a[],int sum,int dp[][]){

        if(sum>amt) return 0;

        if(sum==amt){
            return 1;
        }
        if(idx==a.length){
            if(sum==amt) return 1;
            return 0;
        }

        
    if(dp[idx][sum]!=-1) return dp[idx][sum];
        int tak2=fun(amt,idx,a,sum+a[idx],dp);

 
        int not=fun(amt,idx+1,a,sum,dp);

        dp[idx][sum]=tak2+not;

        return  dp[idx][sum];
    }
}
