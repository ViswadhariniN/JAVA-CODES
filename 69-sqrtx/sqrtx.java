class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1, right = x, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Use long to avoid overflow
            long square = (long) mid * mid;

            if (square == x) {
                return mid; // Perfect square
            } else if (square < x) {
                ans = mid;       // store the last valid result
                left = mid + 1;  // search in right half
            } else {
                right = mid - 1; // search in left half
            }
        }

        return ans;
    }
}