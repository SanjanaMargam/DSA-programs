class Solution {
    public int reverse(int x) {

       
        long rev=0;
       // x=Math.abs(x);

        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            if(rev> Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
            x=x/10;
        }

       

return (int)rev;




       
        
        
    }
}
