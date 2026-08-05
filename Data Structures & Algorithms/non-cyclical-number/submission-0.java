class Solution {
    public boolean isHappy(int n) {


        Set<Integer> s =new HashSet<>();

        while(n!=1){

            int num=n;
            int sq=0;
        while(num!=0){
            int rem=num%10;
            sq=sq+ (rem*rem);
            num=num/10;
        }
        if(s.contains(sq)) return false;
        s.add(sq);
        
        n=sq;

        }

        return true;
        
    }
}
