class Solution {

     static int dx[]={-1,0,1,0};
     static int dy[]={0,1,0,-1};
    public int numIslands(char[][] a) {


        boolean v[][]=new boolean[a.length][a[0].length];
int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){

                if(a[i][j]-'0' == 1 && v[i][j]==false){
                    c++;
                    dfs(a,v,i,j);
                }
            }
        }
        return c;
        
    }

    void dfs(char a[][],boolean v[][],int i,int j){


        if(i<0 || i>=a.length || j<0 || j>=a[0].length || v[i][j]==true){
            return;
        }

        v[i][j]=true;

        for(int k=0;k<4;k++){

            int p=i+dx[k];
            int q=j+dy[k];

            if(p>=0 && p<a.length && q>=0 && q<a[0].length && a[p][q]-'0' == 1 && v[p][q]==false){
                dfs(a,v,p,q);
            }
        }


    }
}
