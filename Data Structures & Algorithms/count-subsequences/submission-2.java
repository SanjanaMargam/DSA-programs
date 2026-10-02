class Solution {
    public int numDistinct(String s, String t) {


//        StringBuilder st=new StringBuilder();
int dp[][]=new int[s.length()][t.length()];

for(int i=0;i<s.length();i++)
Arrays.fill(dp[i],-1);

     return   fun(0,0,s,t,dp);
        
    }

 int fun(int i,int j,String s,String t,int dp[][]){

    if(j==t.length()) return 1;

    if(i==s.length()) return 0;




    if(dp[i][j]!=-1) return dp[i][j];


    if(s.charAt(i)==t.charAt(j)){

      dp[i][j]=  fun(i+1,j+1,s,t,dp)+
        fun(i+1,j,s,t,dp);
    }
    else{
        dp[i][j]=fun(i+1,j,s,t,dp);
    }


    return dp[i][j];

    


 }
}
