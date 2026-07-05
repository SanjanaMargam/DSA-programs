class Solution {
    public List<List<String>> partition(String s) {


        List<String > l=new ArrayList<>();

        List<List<String>> l2=new ArrayList<>();


        
             part(s,l,l2,0);

        

       

        return l2;


        
    }

  void  part(String s,List<String > l,List<List<String>> l2,int start){

        if(start==s.length()) {
            l2.add(new ArrayList<>(l));
            return ;
        }



        for(int i=start;i<s.length();i++){

            String str=s.substring(start,i+1);

            if(pal(str)){

                l.add(str);
                part(s,l,l2,i+1);
                l.remove(str);
            }


        }







    }

    boolean pal(String s){

        for(int i=0;i<=s.length()/2;i++){

            if(s.charAt(i)!=s.charAt(s.length()-(i+1))) return false;
        }

        return true;
    }
}
