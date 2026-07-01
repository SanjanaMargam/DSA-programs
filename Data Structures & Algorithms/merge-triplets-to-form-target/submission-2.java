class Solution {
    public boolean mergeTriplets(int[][] tp, int[] k) {

boolean x, y, z;
x = y = z = false;
 
        for(int temp[]:tp){
          
 
            if(temp[0]>k[0] || temp[1]>k[1] || temp[2]>k[2]) continue;

            if(temp[0]==k[0]) x=true;

            if(temp[1]==k[1]) y=true;

            if(temp[2]==k[2]) z=true;


            

        }

        return x&&y&&z;

        


        
    }
}
