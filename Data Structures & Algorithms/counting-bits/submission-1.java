class Solution {
    public int[] countBits(int n) {


  int res[]=new int[n+1];
  res[0]=0;

        for(int i=1;i<=n;i++){

              int c=0;

            if((i&(i-1))==0) res[i]=1;
          
            else{  
              
                        int n2=i;
                while(n2!=0){

                    n2=n2&(n2-1);

                    c++;
                }

                res[i]=c;
            }


        }

        return res;
        
    }
}
