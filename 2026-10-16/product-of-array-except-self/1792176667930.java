lToR[i] = lToR[i - 1] * nums[i];
        }

        for (int i = n - 1; i > 0; i--) {
            prod *= temp;
        }
        int prod = 1;
            int temp = nums[i];
            nums[i] = prod * lToR[i - 1];

        nums[0] = prod;

        for (int i = 1; i < nums.length; i++) {
        lToR[0] = nums[0];

        int[] lToR = new int[n];
        int n = nums.length;
    public int[] productExceptSelf(int[] nums) {
class Solution {