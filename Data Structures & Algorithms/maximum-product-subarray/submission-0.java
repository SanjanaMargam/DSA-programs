class Solution {
    public int maxProduct(int[] a) {

        int maxp = a[0];
        int maxn = a[0];
        int ans = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] < 0) {
                int temp = maxp;
                maxp = maxn;
                maxn = temp;
            }

            maxp = Math.max(a[i], maxp * a[i]);
            maxn = Math.min(a[i], maxn * a[i]);

            ans = Math.max(ans, maxp);
        }

        return ans;
    }
}