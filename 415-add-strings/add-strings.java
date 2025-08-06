class Solution 
{
    public String addStrings(String num1, String num2) 
    {
        // int a=0,b=0;
        // a=Integer.parseInt(num1);
        // b=Integer.parseInt(num2);
        // int c=a+b;
        // String d = String.valueOf(c);
        // return d;
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        // Loop through digits from right to left
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);         // store the unit digit
            carry = sum / 10;                // update carry

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}