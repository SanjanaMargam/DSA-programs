class Solution {
    public boolean isNStraightHand(int[] a, int k) {


        if(a.length%k!=0) return false;

        TreeMap<Integer,Integer> m=new TreeMap<>();

        for(int i=0;i<a.length;i++){

            m.put(a[i],m.getOrDefault(a[i],0)+1);

        }

 
       while(!m.isEmpty()){

        int start=m.firstKey();

        for(int i=start;i<=start+k-1;i++)
        {
            if(!m.containsKey(i)) return false;

            m.put(i,m.getOrDefault(i,0)-1);

            if(m.get(i)<=0) m.remove(i);
        }


       }
       return true;
      



        
    }
}
