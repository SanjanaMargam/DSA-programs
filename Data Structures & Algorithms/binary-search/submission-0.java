class Solution {
    public int search(int[] a, int t) {
        int low = 0, high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == t) {
                return mid;
            }

            if (a[mid] < t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}