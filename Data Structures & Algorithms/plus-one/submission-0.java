class Solution {
    public int[] plusOne(int[] a) {

        int b[]=new int[a.length+1];
        int k=b.length-1,c=0;

        for(int i=a.length-1;i>=0;i--){
            
           if(i==a.length-1 ){

            if( a[i]==9){

           b[k]=0;
           c=1;

           }
           else{

           
            b[k]=a[i]+1;
            c=0;
            
           }
           }
           else{

            if(c==1 && a[i]==9){

                b[k]=0;
                c=1;
            }
            else if(c==1){
                b[k]=a[i]+1;
                c=0;
            }
            else{
                b[k]=a[i];
                c=0;
            }
         
           }
           k--;


        }

        if(c==1){
            b[0]=1;

             return b;
        }
        for(int i=0;i<b.length;i++) System.out.println(b[i]);

        int ans[]=new int[a.length];
        

        for(int i=0;i<a.length;i++){
           
            ans[i]=b[i+1];

        }
        return ans;

      
        
       
    }
}
