class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1); map.put('V', 5); map.put('X', 10);
        map.put('L', 50); map.put('C', 100);
        map.put('D', 500); map.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            int next = 0;

            // Get next value if it's not the last character
            if (i + 1 < s.length()) {
                next = map.get(s.charAt(i + 1));
            }

            if (curr < next) {
                // Subtract if current is less than next
                total -= curr;
            } else {
                // Add otherwise
                total += curr;
            }
        }

        return total;
    }
}