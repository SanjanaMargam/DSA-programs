class Solution {
    public int numDecodings(String s) {


        StringBuilder str=new StringBuilder();

        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        return decode(s,0,dp);
        
    }

    int decode (String s,int idx,int dp[] ){


        if(idx==s.length()) return 1;

 if(dp[idx]!=-1) return dp[idx];
        if(s.charAt(idx)=='0') return 0;

       
      int temp= decode(s,idx+1,dp);
      int t2=0;
      if(idx+1 <s.length() && check(s.substring(idx,idx+2)))
       t2= decode(s,idx+2,dp);
 
 dp[idx]=temp+t2;
        return temp+t2;
    }
    boolean check(String str){

        int num=Integer.parseInt(str);

 
        if(num<0 || num>26) return false;

        return true;

    }
}
