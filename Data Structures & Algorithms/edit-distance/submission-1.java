class Solution {
    public int minDistance(String a, String b) {



        int dp[][]=new int[a.length()][b.length()];

        for(int i=0;i<a.length();i++)
        Arrays.fill(dp[i],-1);

        return fun(a,b,0,0,dp);
        
    }

    int fun(String a,String b,int p1,int p2,int dp[][]){

        if(p1>=a.length() && p2>=b.length()) return 0;

        if(p1==a.length()) return b.length()-p2;

        if(p2==b.length()) return a.length()-p1;


if(dp[p1][p2]!=-1) return dp[p1][p2];

        if(a.charAt(p1)==b.charAt(p2)){ 
            dp[p1][p2]= fun(a,b,p1+1,p2+1,dp);
            return dp[p1][p2];
        }


        dp[p1][p2]=Math.min(1+fun(a,b,p1+1,p2+1,dp),
      Math.min(fun(a,b, p1+1,p2,dp)+1 ,fun(a,b,p1,p2+1,dp)+1 ));

      
      return dp[p1][p2];
      
    


    }
}
