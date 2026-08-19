class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
if (s1.length() + s2.length() != s3.length())
    return false;

        Boolean dp[][]=new Boolean[s1.length()+1][s2.length()+1];

        for(int i=0;i<s1.length();i++)
        Arrays.fill(dp[i],null);
        return fun(s1,s2,s3,0,0,dp);
        
    }

boolean fun(String s1,String s2,String s3,int p1,int p2,Boolean dp[][]){


       if(p1==s1.length() && p2==s2.length()) return true;

 


if(dp[p1][p2]!=null) return dp[p1][p2];
         if(p2<s2.length() && p1<s1.length() && s3.charAt(p1+p2)==s1.charAt(p1) && s3.charAt(p1+p2)==s2.charAt(p2)){

         dp[p1][p2]=  fun(s1,s2,s3,p1+1,p2,dp) || fun(s1,s2,s3,p1,p2+1,dp);

         return  dp[p1][p2];
         }

        if(p1<s1.length() && s3.charAt(p1+p2)==s1.charAt(p1)){

         dp[p1][p2]= fun(s1,s2,s3,p1+1,p2,dp);
        return   dp[p1][p2];
        }

        if(p2<s2.length() && s3.charAt(p1+p2)==s2.charAt(p2)){

         dp[p1][p2]= fun(s1,s2,s3,p1,p2+1,dp);

         return  dp[p1][p2];
        }
        dp[p1][p2]=false;

        return false;
    }
}
