class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> pos = new HashMap<>();
        int max = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (pos.containsKey(ch) && pos.get(ch) >= start) {
                start = pos.get(ch) + 1;
            }

            pos.put(ch, i);

            max = Math.max(max, i - start + 1);
        }

        return max;
    }
}