class Solution {
    public int[] productExceptSelf(int[] a) {

        int suf[]=new int[a.length];
        int pre[]=new int[a.length];
       
        pre[0]=a[0];

        suf[a.length-1]=a[a.length-1];
        for(int i=1;i<a.length;i++){

                pre[i]=a[i]*pre[i-1];


        }

        for(int i=a.length-2;i>=0;i--){
            suf[i]=a[i]*suf[i+1];
        }
int res[]=new int[a.length];

        for(int i=0;i<a.length;i++){
            if(i==0){
                res[i]=suf[i+1];

            }
            else if(i==a.length-1)
            {

                res[i]=pre[i-1];

            }
            else
            {
                res[i]=pre[i-1]*suf[i+1];
            }
        }

        return res;
        
    }
}  
