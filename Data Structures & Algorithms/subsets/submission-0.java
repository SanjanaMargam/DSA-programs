class Solution {
    public List<List<Integer>> subsets(int[] a) {
        

        List<Integer> l=new ArrayList<>();

        List<List<Integer>> l2=new ArrayList<>();

        sums(l,l2,a,0);

        return l2;

    }

   void sums(List<Integer> l,List<List<Integer>> l2,int a[],int idx){

    if(idx==a.length){
        l2.add(new ArrayList<>(l));
        return;
    }

    l.add(a[idx]);
    sums(l,l2,a,idx+1);


    l.remove(l.size()-1);
    sums(l,l2,a,idx+1);


    }
}
