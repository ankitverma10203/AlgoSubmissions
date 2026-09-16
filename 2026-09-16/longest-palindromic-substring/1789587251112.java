class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int left = -1;
        for (int i = 0; i < s.length(); i++) {
            int[] res = palLen(s, i);
            if (max < res[0]) {
                max = res[0];
                left = res[1];
            }
        }

        return s.substring(left, left + max);
    }

    private int[] palLen (String s, int i) {

        // for odd
        int left = i - 1;
        int right = i + 1;
        int[] odd