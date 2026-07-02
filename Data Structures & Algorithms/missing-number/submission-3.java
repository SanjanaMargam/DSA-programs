class Solution {
    public int missingNumber(int[] a) {



Arrays.sort(a);


        for(int i=0;i<a.length;i++){

            if(i!=a[i]) return i;

        }

        return a.length;
        
    }
}
