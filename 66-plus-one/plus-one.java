class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        int n = digits.length;

        // Start from the end
        for (int i = n - 1; i >= 0; i--) {
            // If digit is less than 9, just add 1
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, set it to 0 and continue
            digits[i] = 0;
        }

        // If all digits were 9, we need an extra digit at the start
        int[] result = new int[n + 1];
        result[0] = 1; // rest are already 0 by default
        return result;
    }
}