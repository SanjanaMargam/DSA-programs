class Solution {
    public int longestConsecutive(int[] a) {


if(a.length==0) return 0;
        Set<Integer> s=new HashSet<>();

        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
int c=0,ans=1;
    for(int num:s){
        c=1;
        if(!s.contains(num-1)){
            while(s.contains(num+1)){
                c++;
               ans=Math.max(ans,c);
               num=num+1;
            }
        }
    }

    return ans;
        
    }
}
