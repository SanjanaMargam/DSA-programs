class Solution {
    public int lengthOfLongestSubstring(String s) {


        int p1=0,p2=0,len=0,ans=0;

        Map<Character,Integer> m=new HashMap<>();

        while(p1 < s.length()){


            if(!m.containsKey(s.charAt(p1)) || m.get(s.charAt(p1)) < p2){
                m.put(s.charAt(p1),p1);

                ans=Math.max(ans,p1-p2+1);
            }
            else
            {
               
                int pos=m.get(s.charAt(p1));
                    p2=pos+1;
                m.put(s.charAt(p1),p1);
                ans=Math.max(ans,p1-p2+1);

            }
            p1++;
        }

        return ans;


        
    }
}
