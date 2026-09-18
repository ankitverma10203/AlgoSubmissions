}

        for (int i = 1; i < nums.length; i++) {
            max2 = Math.max(a + nums[i], b);
        a = 0;
        b = 0;
            a = b;
            b = max1;
            a = b;
            b = max2;
        }

        return Math.max(max1, max2);
    }
}
            max1 = Math.max(a + nums[i], b);
        for (int i = 0; i < nums.length - 1; i++) {
        int b = 0;
        int a = 0;

        int max2 = 0;
        int max1 = 0;
    public int rob(int[] nums) {
class Solution {