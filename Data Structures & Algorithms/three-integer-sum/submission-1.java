class Solution {
    public List<List<Integer>> threeSum(int[] a) {

        Arrays.sort(a);


        int k=0;

        List<List<Integer>> l2=new ArrayList<>();

        for(int i=0;i<a.length;i++){

            List<Integer> l=new ArrayList<>();

            int p1=i+1,p2=a.length-1,p3=i;


            while(p1<p2){

                if(a[p1]+a[p2]+a[p3]==k){
                    l.add(a[p1]);
                    l.add(a[p2]);
                    l.add(a[p3]);
                if(!l2.contains(l))
                    l2.add(new ArrayList<>(l));
                    l.clear();               
                    p2--;
                    continue;
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
