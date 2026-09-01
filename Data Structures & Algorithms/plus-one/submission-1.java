class Solution {
    public int[] plusOne(int[] a) {

        int b[] = new int[a.length + 1];

        int k = b.length - 1;
        int carry = 1;

        for (int i = a.length - 1; i >= 0; i--) {

            if (carry == 1) {

                if (a[i] == 9) {
                    b[k] = 0;
                    carry = 1;
                } 
                else {
                    b[k] = a[i] + 1;
                    carry = 0;
                }

            } 
            else {
                b[k] = a[i];
            }

            k--;
        }

        if (carry == 1) {
            b[0] = 1;
            return b;
        }

        int ans[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            ans[i] = b[i + 1];
        }

        return ans;
    }
}