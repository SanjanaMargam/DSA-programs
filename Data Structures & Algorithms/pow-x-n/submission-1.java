class Solution {
    public double myPow(double x, int m) {
       

       if(m==0) return 1.0;
        double ans=1.0;
        int p=m;
        long n=m;


      if(n<0){
        x=1/x;
        n=-n;

      }
        while(n>0){
 
           
           if(n%2==1){
            ans=ans*x;
           }
             x=x*x;
              n=n/2;
               
        }

         
         return ans;
       
    }
}
