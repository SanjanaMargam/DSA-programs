class Solution {
    public int rob(int[] a) {


         int dp[]=new int[a.length];
         int dp2[]=new int[a.length];

    if(a.length==1) return a[0];

        Arrays.fill(dp,-1);

         Arrays.fill(dp2,-1);

     return   Math.max(roby(a,0,dp), roby2(a,1,dp2));

    }
    int roby(int a[],int idx,int dp[]){


        if(idx>=a.length-1) return 0;
  if(dp[idx]!=-1) return dp[idx];

       int ref= roby(a,idx+2,dp);
       
       ref= ref+a[idx];
       
       

      int l=  roby(a,idx+1,dp);

          dp[idx]=Math.max(ref,l);

        return dp[idx];
    }

    int roby2(int a[],int idx,int dp[]){


        if(idx>=a.length) return 0;
  if(dp[idx]!=-1) return dp[idx];

       int ref= roby2(a,idx+2,dp);
       
       ref=ref+a[idx];
       
       

      int l=  roby2(a,idx+1,dp);

          dp[idx]=Math.max(ref,l);

        return dp[idx];
    }



        
        
    
}
