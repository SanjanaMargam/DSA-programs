class Solution {
    public List<List<Integer>> permute(int[] a) {

        List<Integer> l=new ArrayList<>();
        List<List<Integer>> l2=new ArrayList<>();
        perm(a,0,l,l2);

        return l2;
        
    }

    void perm(int a[],int idx,List<Integer> l,List<List<Integer>> l2){

        if(idx==a.length){
            l2.add(new ArrayList<>(l));

            return;
        }

        for(int i=0;i<a.length;i++){

            if(!l.contains(a[i])){
                l.add(a[i]);
                  perm(a,idx+1,l,l2);

                    if(!l.isEmpty()) l.remove(l.size()-1);
            }
          

          
        }


    
    }
}
