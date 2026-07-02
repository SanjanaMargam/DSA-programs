class Solution {
    public List<List<Integer>> combinationSum(int[] a, int k) {

 
        

        List<Integer> l=new ArrayList<>();

        List<List<Integer>> l2=new ArrayList<>();

        sums(l,l2,a,0,k,0);

        return l2;

    }

   void sums(List<Integer> l,List<List<Integer>> l2,int a[],int idx,int tar,int sum){
if(sum>tar) return;

    if(idx==a.length){
         if(tar==sum){
            if(!l2.contains(l))
        l2.add(new ArrayList<>(l));

        return;
    }
    else
     return;


    }

  
        l.add(a[idx]);
        
        sums(l,l2,a,idx,tar,sum+a[idx]);

        sums(l,l2,a,idx+1,tar,sum+a[idx]);
    


    

    l.remove(l.size()-1);

    sums(l,l2,a,idx+1,tar,sum);

    




        
    }
}
