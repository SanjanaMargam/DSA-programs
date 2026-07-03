class Solution {
    public String longestPalindrome(String s) {


        int p1=0,p2=0,ans=Integer.MIN_VALUE;
        String answ="";

        while(p2<s.length()){

            char ch=s.charAt(p2);
            int odd[]=oddd(p2-1,p2+1,s);
            int oddlen=odd[1]-odd[0] +1 ;
            int even[]=eve(p2,p2+1,s);
            int evenlen= even[1]-even[0]+1;
            if( oddlen>ans){

                StringBuilder st=new StringBuilder();

                for(int i=odd[0]; i<=odd[1] ;i++){
                    st.append(s.charAt(i));

                }
                ans=oddlen;
                answ=st.toString();

            }
              if( evenlen>ans){

                StringBuilder st=new StringBuilder();

                for(int i=even[0]; i<=even[1] ;i++){
                    st.append(s.charAt(i));

                }
                answ=st.toString();
                ans=evenlen;

            }

            p2++;

           
        }

        return answ;       
    }

    int[] oddd(int p1,int p3,String s){

        while(p1>=0 && p3<s.length() &&s.charAt(p1)==s.charAt(p3)){

            p1--;
            p3++;

        }

        return new int[]{p1+1,p3-1};

    }

      int[] eve(int p2,int p3,String s){

        while(p2>=0 && p3<s.length() &&s.charAt(p2)==s.charAt(p3)){

            p2--;
            p3++;

        }

        return new int[]{p2+1,p3-1};

    }
   
}
