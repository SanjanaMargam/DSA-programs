class Solution {
    public int uniquePaths(int m, int n) {

            int dp[][]=new int[m][n];

            for(int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
      return   path(m,n,m-1,n-1,dp);
        
    }

    int path(int m,int n,int i,int j,int dp[][]){

        if(i==0 && j==0) return 1;

        if(i<0 || j<0 || i>m || j>n)  return 0;

    if(dp[i][j]!=-1) return dp[i][j];
     int row=   path(m,n,i,j-1,dp);
      int col=  path(m,n,i-1,j,dp);
     dp[i][j]=row+col;

        return dp[i][j];

      
    }
}
