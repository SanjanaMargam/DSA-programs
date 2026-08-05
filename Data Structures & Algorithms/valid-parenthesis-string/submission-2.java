class Solution {
    public boolean checkValidString(String s) {


        Boolean dp[][]=new Boolean[s.length()][s.length()];

        for(int i=0;i<s.length();i++)
        Arrays.fill(dp[0],null);
       return  fun(s,0,0,dp);
        
    }

    Boolean fun(String s,int bal,int idx,Boolean dp[][]){


        if(bal<0) return false;

        if(idx==s.length()) {
            if(bal==0) return true;
            return false;
        }
        if(dp[bal][idx]!=null) return dp[bal][idx];

        if(s.charAt(idx)=='(') dp[bal][idx]= fun(s,bal+1,idx+1,dp);

        else if(s.charAt(idx)==')') dp[bal][idx]= fun(s,bal-1,idx+1,dp);

      else   dp[bal][idx]= fun(s,bal+1,idx+1,dp)||fun(s,bal-1,idx+1,dp)||fun(s,bal,idx+1,dp);

      return dp[bal][idx];

    }
}
