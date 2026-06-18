class Solution {
    public int characterReplacement(String s, int k) {

       int left=0,right=0,maxf=0,ans=1;

       int fre[]=new int[26];

       for(right=0;right<s.length();right++){

        fre[s.charAt(right)-'A']++;

        maxf=Math.max(maxf,fre[s.charAt(right)-'A']);

        while((right-left+1)-maxf >k){
            fre[s.charAt(left)-'A']--;
            left++;


        }

        ans=Math.max(ans,(right-left+1));

        
       }


    return ans;


       

        
    }
}
