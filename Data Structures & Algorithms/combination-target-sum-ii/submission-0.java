class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int k) {
 

        List<Integer> l=new ArrayList<>();

        List<List<Integer>> l2=new ArrayList<>();
        Arrays.sort(a);

        sums(l,l2,a,0,k,0);

        return l2;

    }

   void sums(List<Integer> l,List<List<Integer>> l2,int a[],int idx,int tar,int sum){
 



   
         if(tar==sum){
        l2.add(new ArrayList<>(l));

        return;
    }

    if(idx==a.length || sum>tar) return;
    

       
        l.add(a[idx]);
        
        
        sums(l,l2,a,idx+1,tar,sum+a[idx]);
 
    l.remove(l.size()-1);

    int next=idx+1;
     while(    next<a.length && a[next]==a[idx])
    next++;


    sums(l,l2,a,next,tar,sum);
 

        
    }
}
