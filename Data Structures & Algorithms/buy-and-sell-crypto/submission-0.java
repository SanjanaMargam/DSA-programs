class Solution {
    public int maxProfit(int[] a) {

        int ans=0,p1=0,p2=1;

      while(p2<a.length){

            if(a[p2]>=a[p1]){
                ans=Math.max(ans,a[p2]-a[p1]);
                p2++;
            }
            else{
                p1=p2;
                p2++;
            }


        }

        return ans;

        
    }
}
