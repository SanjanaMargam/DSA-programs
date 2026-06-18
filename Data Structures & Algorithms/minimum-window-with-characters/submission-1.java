class Solution {
    public String minWindow(String s, String t) {

if(t.length()>s.length()) return  "";

        Map<Character,Integer> mt=new HashMap<>();

        for(int i=0;i<t.length();i++){
            mt.put(t.charAt(i),mt.getOrDefault(t.charAt(i),0)+1);
        }

        int p1=0,p2=0,have=0,k=0,l=0,ans=Integer.MAX_VALUE;
        Map<Character,Integer> ms=new HashMap<>();

        while(p2<s.length()){

            ms.put(s.charAt(p2),ms.getOrDefault(s.charAt(p2),0)+1);

            if(mt.containsKey(s.charAt(p2)) && mt.get(s.charAt(p2)).equals(ms.get(s.charAt(p2)))){
                have++;
            }

            while(have==mt.size()){

               if((p2-p1)<ans){
                ans=p2-p1;
                k=p1;
                l=p2;             
               }

               if(mt.containsKey(s.charAt(p1)) && mt.get(s.charAt(p1)).equals(ms.get(s.charAt(p1)))){
                have--;
               }

               ms.put(s.charAt(p1),ms.getOrDefault(s.charAt(p1),0)-1);

               if(ms.get(s.charAt(p1))==0) ms.remove(s.charAt(p1));

               p1++;


            }

            p2++;

        }

        StringBuilder st=new StringBuilder("");

        for(int i=k;i<=l;i++){

            st.append(s.charAt(i));
        }

       if(ans!=Integer.MAX_VALUE) return st.toString();
       else return "";
        
    }
}
