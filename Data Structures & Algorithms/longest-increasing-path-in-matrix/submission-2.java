class Solution {

    static int dx[]={-1,0,1,0};
    static int dy[]={0,1,0,-1};
    public int longestIncreasingPath(int[][] a) {
        int dp[][]=new int[a.length][a[0].length];

        for(int i=0;i<a.length;i++){

            Arrays.fill(dp[i],-1);
        }

        int ans=1;
        for(int i=0;i<a.length;i++){

            for(int j=0;j<a[0].length;j++)
            {

            ans=Math.max(ans,dfs(i,j,a,dp,a.length,a[0].length));
            
            }
        }

        return ans;

        
    }
    int dfs(int i,int j,int a[][],int dp[][],int m,int n){


        if(dp[i][j]!=-1) return dp[i][j];


        int c=1;
        for(int k=0;k<4;k++){

            int p=i+dx[k];
            int q=j+dy[k];
            if(p>=0 && p<m && q>=0 && q<n && a[p][q]>a[i][j] ){
                c = Math.max(c, 1 + dfs(p, q, a, dp, m, n));
            }
            
        }

        dp[i][j]=c;
        return c;


    }
}
