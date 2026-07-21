class Solution {
    public int eraseOverlapIntervals(int[][] a) {
 
 Arrays.sort(a, (ar,br)->Integer.compare(ar[0],br[0]));
    int start=0,end=0;
    start=a[0][0];
         end=a[0][1];
         int c=0;
if(a.length==1 )return 0;
    for(int i=1;i<a.length-1;i++){         
         
         if(end> a[i][0] && end>a[i][1])
         {
            c++;
            start=a[i][0];
            end=a[i][1];
            continue;

         }
         else if(end>a[i][0] && end<a[i][1]){
         c++;
           
          continue;
         }
         else if(end<=a[i][0]){
          start=a[i][0];
          end=a[i][1];
         
          continue;
         }
         else if(end==a[i][1]){
          c++;
         }
  } 

  if(end==a[a.length-1][1] || end>a[a.length-1][0]) c++;

  return c;       
    }
}
