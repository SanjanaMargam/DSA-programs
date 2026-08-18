class Solution {

    static int dx[]={-1,0,1,0};
    static int dy[]={0,1,0,-1};
    public int maxAreaOfIsland(int[][] a) {


        boolean v[][]=new boolean[a.length][a[0].length];


        int ans=0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                
                if(a[i][j]==1 && v[i][j]==false){

                    int c=dfs(a,i,j,v);

                    ans=Math.max(ans,c);
                }

            }
        }
        
return ans;

    }

    int dfs(int a[][],int i,int j,boolean v[][]){



if(i<0 || i>=a.length || j<0 || j>=a[0].length || v[i][j]==true) return 0;

        v[i][j]=true;
        int c=1;

        for(int k=0;k<4;k++){
            int p=i+dx[k];
            int q=j+dy[k];

            if(p>=0 && p<a.length && q>=0 && q<a[0].length && a[p][q]==1 && v[p][q]==false)
            {
               c=c+ dfs(a,p,q,v);
            }
        }

        return c;
    }
}
