class Solution {

    public String encode(List<String> l) {

       StringBuilder st=new StringBuilder();

       for(String str:l){

       int len=str.length();

       st.append(len);
       st.append('#');

       st.append(str);

       }

      return  st.toString();

    }

    public List<String> decode(String str) {

        List<String> l=new ArrayList<>();

        int i=0;

        while(i<str.length()){
            int j=i;

            while(str.charAt(j)!='#'){
                j++;
            }

            int len=Integer.parseInt(str.substring(i,j));

            String newo=str.substring(j+1,j+1+len);
            l.add(newo);
            i=j+1+len;
        }

        return l;

    

    }
}
