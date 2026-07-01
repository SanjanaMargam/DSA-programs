class Solution {
    public List<Integer> partitionLabels(String s) {

    Map<Character,Integer> m=new HashMap<>();

    for(int i=0;i<s.length();i++){
        m.put(s.charAt(i),i);
    }

    int p1=0 ,last=0,len=0;
    List<Integer> l=new ArrayList<>();

    while(p1<s.length()){

           last=Math.max(last,m.get(s.charAt(p1)));
             len++;
           if(p1==last){
            last=0;
            l.add(len);
            len=0;


           }
          

          


         p1++;

    }

    return l;
        
    }
}
