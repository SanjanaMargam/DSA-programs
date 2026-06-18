class Solution {
    public int[] twoSum(int[] a, int t) {

        int res[]=new int[2];

      Map<Integer,Integer> s=new HashMap<>();

      for(int i=0;i<a.length;i++){
      s.put(a[i],i);
      }


      for(int i=0;i<a.length;i++){

        if(s.containsKey(t-a[i]) && s.get(t-a[i]) != i) {

            res[0]=i;
            res[1]=s.get(t-a[i]);
            return res;
        }
      }
return res;

        
    }
}
