class Solution 
{
    public int firstUniqChar(String s) 
    {
        // for(int i=0;i<s.length();i++)
        // {
        //     char b = s.charAt(i);int count=0;
        //     for(int j=0;j<s.length();j++)
        //     {
        //         char c=s.charAt(j);
        //         if(c==b)
        //         count++;
        //     }
        //     if(count==1)
        //     return i;
        // }
        // return -1;
          Map<Character, Integer> count = new HashMap<>();

        // Step 1: Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find first character with count = 1
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No non-repeating character
    }
}