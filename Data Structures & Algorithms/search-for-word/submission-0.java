class Solution {
    public boolean exist(char[][] b, String s) {


            int m=b.length;
            int n=b[0].length;
        boolean vis[][]=new boolean[b.length][b[0].length];

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){


                if(b[i][j]==s.charAt(0)){
                     if( search(b,s,vis,m,n,0,i,j)){
                        return true;
                     }

                }
            }
        }

        return false;

       
        
    }

   boolean search(char b[][],String s,boolean v[][],int m,int n,int idx,int i,int j){

        if(idx==s.length()){
            return true;
        }

        if(i<0 || j<0 || i>=m || j>=n) return false;

        if(b[i][j]==s.charAt(idx) && v[i][j]) return false;

        if(b[i][j]!=s.charAt(idx)){
            return false;
        }





        v[i][j]=true;
        if(search(b,s,v,m,n,idx+1,i+1,j) ||
        search(b,s,v,m,n,idx+1,i-1,j) ||
        search(b,s,v,m,n,idx+1,i,j+1) ||
        search(b,s,v,m,n,idx+1,i,j-1) ){

            v[i][j]=false;

            return true;
        }

        v[i][j]=false;

        return false;






    }
}
