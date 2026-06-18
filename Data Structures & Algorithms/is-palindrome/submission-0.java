class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder st=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ' && Character.isLetterOrDigit(s.charAt(i)))
            st.append(s.charAt(i));
        }

        System.out.println(st);

        int  p1=0,p2=st.length()-1;

        while(p1<=p2){

            

            if(Character.toLowerCase(st.charAt(p1))!=Character.toLowerCase(st.charAt(p2))){
                return false;
            }
            p1++;
            p2--;

        }

        return true;
        
    }
}
