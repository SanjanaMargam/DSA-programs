class Solution {
    public List<List<Integer>> subsetsWithDup(int[] a) {
        Arrays.sort(a);

        List<Integer> l=new ArrayList<>();

        List<List<Integer>> l2=new ArrayList<>();

          sub(a,l,l2,0);

          return l2;
        
    }

    void sub(int a[], List<Integer> l,List<List<Integer>> l2,int idx){

        if(idx==a.length){
            l2.add(new ArrayList<>(l));
            return ;
        }


        l.add(a[idx]);

        sub(a,l,l2,idx+1);

        l.remove(l.size()-1);

        int next=idx+1;

        while(next<a.length && a[next]==a[idx]){
            next++;
        }

        sub(a,l,l2,next);


    
    }
}
