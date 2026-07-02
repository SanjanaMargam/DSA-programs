class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> l=new ArrayList<>();
        StringBuilder s=new StringBuilder();

        gen(n,0,0,l ,s );

        return l;
        
    }


    void gen(int n,int oc,int cc, List<String> l,StringBuilder s){


        if(oc==n && cc==n){
            l.add(s.toString());
            return;
        }

        if(oc<n){

            gen(n,oc+1,cc,l,s.append('('));
s.deleteCharAt(s.length()-1);
           

        }
 

         if(cc<oc){

            gen(n,oc,cc+1,l,s.append(')'));
s.deleteCharAt(s.length()-1);

         }

         
    }
}
