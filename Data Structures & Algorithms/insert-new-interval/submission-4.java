class Solution {
    public int[][] insert(int[][] a, int[] k) {

        int[][] res=new int[a.length+1][2];

int g=0,start=k[0],end=k[1];

        for(int temp[]:a){

          
            if(temp[1]<k[0]){
                res[g][0]=temp[0];
                res[g][1]=temp[1];
                g++;
                continue;


            }
                start=temp[0];
              end=temp[1];

            if(temp[0]>k[1]){
                res[g][0]=k[0];
                res[g][1]=k[1];
                g++;
                k[0]=temp[0];
                k[1]=temp[1];

                continue;

                 

            }


            if(temp[0] > k[1]){
              start=k[0];
              end=k[1];
                
            }
            else if(temp[1]>k[1]  ){

                if(temp[0]>k[0]){
                    start=k[0];
                }
                else{
                    start=temp[0];
                }
                end=temp[1];
            }
            else{

                if(temp[0]>k[0]){
                    start=k[0];

                }
                else{
                    start=temp[0];
                }
                end=k[1];

            }

            k[0]=start;
            k[1]=end;

             



        }

        
        res[g][0]=start;
        res[g][1]=end;

       int[][] nea = new int[g+1][2];

for (int i = 0; i < g+1; i++) {
    nea[i][0] = res[i][0];
    nea[i][1] = res[i][1];
}
       

        return nea;
        
    }
}
