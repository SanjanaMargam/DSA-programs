class Solution {
    public int[] twoSum(int[] a, int k) {

        int p1=0,p2=a.length-1;

        int res[]=new int[2];

        while(p1<p2){
            if(a[p1]+a[p2]==k){
                res[0]=p1+1;
                res[1]=p2+1;
                break;
            }

            else if(a[p1]+a[p2]<k){
                p1++;
            }
            else p2--;
        }

        return res;
        
    }
}
