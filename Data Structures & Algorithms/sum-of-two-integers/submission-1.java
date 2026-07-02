class Solution {
    public int getSum(int a, int b) {

        int ans = 0;
        int carry = 0;

        for(int i=0;i<32;i++){

            int b1 = (a >> i) & 1;
            int b2 = (b >> i) & 1;

            int bit = b1 ^ b2 ^ carry;

            carry = (b1 & b2) | (b1 & carry) | (b2 & carry);

            if(bit==1)
                ans |= (1<<i);
        }

        return ans;
    }
}