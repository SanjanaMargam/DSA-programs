

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int fre[]=new int[26];

         int pre[]=new int[26];

        if(s1.length()>s2.length()) return false;

for(int i=0;i<s1.length();i++){
    fre[s1.charAt(i)-'a']++;
}
int p1=0,p2=s1.length()-1;
for(int i=0;i<=p2;i++){
    pre[s2.charAt(i)-'a']++;
}

 if(Arrays.equals(pre,fre)) return true;

while(p2<s2.length()){

   if(Arrays.equals(pre,fre)) return true;

    p2++;
   

    if(p2<s2.length()) pre[s2.charAt(p2)-'a']++;

   if(p1<s2.length()) pre[s2.charAt(p1)-'a']--;
    p1++;
}

return false;





        
    }
}
