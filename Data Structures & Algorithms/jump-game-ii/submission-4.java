class Solution {

    int ans=Integer.MAX_VALUE;
    public int jump(int[] a) {


int dp[]=new int[a.length] ;

Arrays.fill(dp,-1);
          

        return runs(a,0,dp);
        
    }

    int runs(int a[],int idx ,int dp[]){

       if(idx >= a.length-1 ){
   
    return 0;
}
        if(dp[idx] !=-1)  return dp[idx] ;

        int ans=Integer.MAX_VALUE;
        for(int i=1;i<=a[idx];i++){


            if(i+idx < a.length  && runs(a,idx+i,dp)!=Integer.MAX_VALUE)

 ans=Math.min(ans,1+runs(a,idx+i,dp));


        }
dp[idx]=ans;
        return dp[idx];


    }
}
