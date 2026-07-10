class Solution {
    public boolean wordBreak(String s, List<String> l) {

        Boolean dp[]=new Boolean[s.length()];

        Arrays.fill(dp,null);


      return   word(s,l,0,dp);



        
        
    }

    boolean word(String s,List<String> l,int idx,Boolean dp[]){

        if(idx==s.length()) return true;


if(dp[idx]!=null) return dp[idx];

        for(String w:l){
            if(s.startsWith(w,idx)){

                if(word(s,l,idx+w.length(),dp)) {
                    dp[idx]= true;
                return dp[idx];
                }
            }
        }
dp[idx]=false;
        return dp[idx];


       
         



    }
}
