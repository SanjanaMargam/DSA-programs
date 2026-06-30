class Solution {
    public boolean canJump(int[] a) {




        int maxi=0;

        for(int i=0;i<a.length;i++){

            if(i>maxi) return false;

            maxi=Math.max(maxi,i+a[i]);
        }

        return true;
        
    }
}
