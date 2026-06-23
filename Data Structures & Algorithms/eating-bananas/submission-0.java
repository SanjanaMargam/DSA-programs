class Solution {
    public int minEatingSpeed(int[] a, int k) {
        int h=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){

            h=Math.max(h,a[i]);

        }

        int low=1,ans=0;


        while(low<=h){

            int mid=(low+h)/2;
             System.out.println("mid "+mid);

            if(fun(mid,k,a)){
                ans=mid;

                h=mid-1;
            }
            else
            low=mid+1;
        }

        return ans;
        
    }

    boolean fun(int mid,int k,int a[]){
        int ban=0;

        for(int i=0;i<a.length;i++){
           
           ban+=(Math.ceil(((double)a[i]/mid)));

        }
    System.out.println("ban "+ban);
        if(ban<=k) return true;

        return false;


    }
}
