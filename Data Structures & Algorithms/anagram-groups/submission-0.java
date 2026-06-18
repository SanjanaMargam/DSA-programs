class Solution {
    public List<List<String>> groupAnagrams(String[] a) {

        Map<String, List<String>> res=new HashMap<>();

        for(int i=0;i<a.length;i++){

           char ch[]=a[i].toCharArray();
            Arrays.sort(ch);
        String mon=new String(ch);

            res.putIfAbsent(mon,new ArrayList<>());
          
                res.get(mon).add(a[i]);

            
            
              
            

           


        }

        return new ArrayList(res.values());

      
        
    }
}
