class Solution {
    public List<String> letterCombinations(String digits) {

        String[] map = {
    "",     // 0
    "",     // 1
    "abc",  // 2
    "def",  // 3
    "ghi",  // 4
    "jkl",  // 5
    "mno",  // 6
    "pqrs", // 7
    "tuv",  // 8
    "wxyz"  // 9
};
List<String> l=new ArrayList<>();

if(digits.length()==0) return l;
StringBuilder str=new StringBuilder();
combo( digits,map,str,0,l);


return l;

        
    }

   void combo(String d, String map[],StringBuilder str,int idx, List<String> l){
        if(idx>=d.length()){

            l.add(str.toString());
            return;
        }



        String p=map[d.charAt(idx)-'0'];
        System.out.println(p);

        for(int i=0;i<p.length();i++){

            str.append(p.charAt(i));
            combo(d,map,str,idx+1,l);
            str.deleteCharAt(str.length()-1);
        }

    }
}
