class Pair{
    int a,b;
    Pair(int i,int j){
        a=i;
        b=j;
    }
}
class Solution {
    public void setZeroes(int[][] a) {

       int col=1;

       for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){

            if(a[i][j]==0){

                a[i][0]=0;

                if(j!=0)
                a[0][j]=0;
                else
                col=0;
            }
        }
       }


       for(int i=1;i<a.length;i++){
        for(int j=1;j<a[0].length;j++){
            if(a[i][j]!=0){

                if(a[i][0]==0 || a[0][j]==0)
                a[i][j]=0;
            }
        }
       }
       if(a[0][0]==0){
        for(int i=0;i<a[0].length;i++){
            a[0][i]=0;
        }
       }

       if(col==0){
        a[0][0]=0;

        for(int i=0;i<a.length;i++){
            a[i][0]=0;
        }
       }

        
        
    }
}
