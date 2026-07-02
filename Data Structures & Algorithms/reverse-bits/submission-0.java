class Solution {
    public int reverseBits(int n) {

        long val=0,k=0;


        for(int i=31;i>=0;i--){


            int bit=(n>>i)&1;

          if(bit==1){
            val=val |  (1<<k);
           
          }
           k++;

        }

        return (int)val;
        
    }
}
