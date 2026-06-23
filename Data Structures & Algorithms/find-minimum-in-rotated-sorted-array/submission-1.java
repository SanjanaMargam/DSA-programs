class Solution {
    public int findMin(int[] a) {

        int low=0,h=a.length-1,ans=Integer.MAX_VALUE;

            while(low<=h){
            int mid=(low+h)/2;

             if(a[low]>a[mid]){
               ans=Math.min(ans,a[mid]);
               h=mid-1;
             }
             else
             {

                ans=Math.min(ans,a[low]);
                low=mid+1;
               
             }

            }

            return ans;
        
    }
}
