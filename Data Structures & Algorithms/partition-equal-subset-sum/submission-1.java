class Solution {
    public boolean canPartition(int[] a) {


        int sum=0;
        for(int i=0;i<a.length;i++){

            sum+=a[i];
        }

      

        if(sum%2!=0) return false;

          Boolean dp[][]=new Boolean[a.length][sum/2 +1];

          for(int i=0;i<a.length;i++)
          Arrays.fill(dp[0],null);

        return part(a,sum/2,0,0,dp);




        
    }

    boolean part(int a[],int tar,int idx,int sum,Boolean dp[][]){


        if(sum>tar) return false;
        if(sum==tar) return true;
        if(idx==a.length) {
            if(sum==tar) return true;
            else return false;
        }

        if(dp[idx][sum] !=null) return dp[idx][sum];


        boolean pik=false;;
       pik= part(a,tar,idx+1,sum+a[idx],dp);

       boolean not=part(a,tar,idx+1,sum,dp);

        dp[idx][sum]=pik || not;

       return dp[idx][sum];

    }
}
