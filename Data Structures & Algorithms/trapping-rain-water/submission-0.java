class Solution {
    public int trap(int[] a) {


        int suf[]=new int[a.length];
        int pre[]=new int[a.length];

        pre[0]=a[0];
        suf[a.length-1]=a[a.length-1];

        for(int i=1;i<a.length;i++){
            pre[i]=Math.max(a[i],pre[i-1]);
        }

        for(int i=a.length-2;i>=0;i--){

            suf[i]=Math.max(a[i],suf[i+1]);
        }

int sum=0;
        for(int i=0;i<a.length;i++){
         int ans=Math.min(pre[i],suf[i]);
        sum+=( ans-a[i]);
    }

    return sum;
        
    }
}
