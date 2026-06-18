class Solution {
    public int maxArea(int[] a) {

        int p1=0,p2=a.length-1,ans=Integer.MIN_VALUE;

        while(p1<p2){

            int area=(p2-p1)*Math.min(a[p1],a[p2]);

            ans=Math.max(ans,area);

            if(a[p1]<a[p2]) p1++;
            else p2--;
        }


        return ans;

      


        
    }
}
