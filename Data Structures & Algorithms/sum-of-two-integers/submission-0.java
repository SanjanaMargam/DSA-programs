class Solution {
    public int getSum(int a, int b) {

        int val=0,c=0,k=0;

        for(int i=0;i<32;i++){

            int b1=(a>>i)&1;

            int b2=(b>>i)&1;
            int bit=0;

           

            if(b1==1 && b2==1 && c==0){
                bit=0;
                c=1;
            }

            else if(b1==1 && b2==1 && c==1){
                bit=1;
                c=1;
            }
            else if(b1==0 && b2==0 && c==1){
                bit=1;
                c=0;

            }
             else if(b1==0 && b2==0 && c==0){
                bit=0;
                c=0;

            }
            else if(c==1)
            {
                bit=0;
                c=1;
            }
            else{
                bit=1;
                c=0;

            }
 

           if(bit==1){
            val= val | (1<<k);
           }
           k++;



        }


        return val;
        
    }
}
