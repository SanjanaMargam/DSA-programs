class Solution {
    public int missingNumber(int[] a) {


int ans=0;

            for(int i=0;i<=a.length;i++){
                ans=ans^i;

            }


            int bns=0;

            for(int i=0;i<a.length;i++){
                bns=bns^a[i];
            }

            return ans^bns;
 
    }
}
