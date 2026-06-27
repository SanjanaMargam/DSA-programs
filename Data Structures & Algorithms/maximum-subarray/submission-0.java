class Solution {
    public int maxSubArray(int[] a) {

        int sum=0;

        int ans=Integer.MIN_VALUE;


        for(int i=0;i<a.length;i++){

            if(sum+a[i]>=0){
                sum+=a[i];

                ans=Math.max(ans,sum);

            }
            else{
                sum=0;

                ans=Math.max(ans,a[i]);
            }

        }

        return ans;
        
    }
}
