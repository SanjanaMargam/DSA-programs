class Solution {
    public List<List<Integer>> threeSum(int[] a) {

        Arrays.sort(a);


        int k=0;

        List<List<Integer>> l2=new ArrayList<>();

        for(int i=0;i<a.length;i++){

            
                if(i>0 && a[i]==a[i-1]) continue;
            int p1=i+1,p2=a.length-1,p3=i;


            while(p1<p2){

              

                if(a[p1]+a[p2]+a[p3]==k){
                   
                    l2.add(Arrays.asList(a[p1],a[p2],a[p3]));
                               
                    p2--;
                    p1++;
                   while(p1>0 && p1<a.length && a[p1]==a[p1-1]) p1++;

                   while(p2<a.length && p2>0 && a[p2]==a[p2+1]) p2--;
                }

                else if(a[p1]+a[p2]+a[p3]<k){
                    p1++;
                }
                else p2--;

            }
        }

        return l2;        
    }
}
