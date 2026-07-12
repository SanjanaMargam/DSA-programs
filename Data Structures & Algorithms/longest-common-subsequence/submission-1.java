class Solution {
    public int longestCommonSubsequence(String t1, String t2) {


       
            int dp[][]=new int[t1.length()][t2.length()];


        for(int i=0;i<t1.length();i++)
            Arrays.fill(dp[i],-1);

        return longs(t1,t2,0,0,dp);
        
    }

    int longs(String t1,String t2, int p1,int p2,int dp[][]){

        if(p1>=t1.length() || p2>=t2.length()) return 0;

        if(dp[p1][p2]!=-1) return dp[p1][p2];
        if(t1.charAt(p1)==t2.charAt(p2)) {

            int temp=longs(t1,t2,p1+1,p2+1,dp);
            dp[p1][p2]=1+temp;
           return dp[p1][p2];
        }
        else{

        dp[p1][p2]=Math.max(longs(t1,t2,p1+1,p2,dp) ,longs(t1,t2,p1,p2+1,dp));

        return dp[p1][p2];
        }
    }
}
