class Solution {
    public boolean mergeTriplets(int[][] tp, int[] k) {

        int m=tp.length,n=tp[0].length;


        List<int[]> l=new ArrayList<>();

        for(int i=0;i<m;i++){
            int temp[]=tp[i];
            int f=0;

            for(int j=0;j<3;j++){
                if(temp[j]>k[j]){  
                        f=1;

                }
            }

            if(f==0) l.add(temp);

        }

        int got=0;

       for(int i=0;i<3;i++){

        for(int ma[] : l){
            if(ma[i]==k[i]){
                got++;
                break;
            }
        }
       }

       return got==3;


        
    }
}
