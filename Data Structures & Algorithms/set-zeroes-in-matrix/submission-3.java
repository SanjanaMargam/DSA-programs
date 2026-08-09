class Pair{
    int a,b;
    Pair(int i,int j){
        a=i;
        b=j;
    }
}
class Solution {
    public void setZeroes(int[][] a) {

        List<Pair> l=new ArrayList<>();


        for(int i=0;i<a.length;i++){

            for(int j=0;j<a[0].length;j++){

                if(a[i][j]==0){

                    Pair p=new Pair(i,j);

                    l.add(p);

                }
            }
        }
       

        for(Pair m:l){

            int row=m.a;
            int col=m.b;

           for(int e=0;e<a[0].length;e++)
           {
           a[row][e]=0;
          


           }
         for(int e=0;e<a.length;e++){
            a[e][col]=0;
         }
           

        }

        
        
    }
}
