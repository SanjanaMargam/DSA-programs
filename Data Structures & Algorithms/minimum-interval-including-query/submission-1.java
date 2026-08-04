class Solution {
    public int[] minInterval(int[][] a, int[] q) {


    
    Arrays.sort(a,(x,y)-> Integer.compare(x[0],y[0]));

int ans[]=new int[q.length];

Arrays.fill(ans,Integer.MAX_VALUE);
       for(int i=0;i<q.length;i++){

            for(int j=0;j<a.length;j++){
                    int temp[]=a[j];

                   if(temp[0]<=q[i] && q[i]<=temp[1]){

                          ans[i]=Math.min(ans[i], temp[1]-temp[0]+1);


                     }
                     if(temp[0]>q[i]) break;
                    
            }

            if(ans[i]==Integer.MAX_VALUE) ans[i]=-1;
     }

     return ans;
        
    }
}
