

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty())
            return 0;

        int start = 0;
        int maxString = 0;
        int end = s.length() - 1;
        int pointer = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (pointer <= end) {
            if (!map.containsKey(s.charAt(pointer))) {
                map.put(s.charAt(pointer), pointer);
                pointer++;
            } else {
                maxString = Math.max(maxString, pointer - start);

                map.remove(s.charAt(start));
                start++;
            }
        }

        maxString = Math.max(maxString, pointer - start);

        return maxString;
    }
}