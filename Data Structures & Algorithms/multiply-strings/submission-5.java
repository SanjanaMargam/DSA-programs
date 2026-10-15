class Solution {
    public String multiply(String a, String b) {

        if(a.equals("0") || b.equals("0")) return "0";

        int m=a.length(),n=b.length();
        int res[]=new int[m+n];

        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){

                int num1=a.charAt(i)-'0';
                int num2=b.charAt(j)-'0';

                int mul=num1*num2;

                int sum=mul+res[i+j+1];

                res[i+j+1]=sum%10;
                res[i+j]+=sum/10;

                

            }
        }

        StringBuilder s=new StringBuilder();

        for(int i=0;i<res.length;i++){
            if (s.length() == 0 && res[i] == 0) {
                continue;
            }
            s.append(res[i]);
        }

        return s.toString();

        





        
        

    }
}
