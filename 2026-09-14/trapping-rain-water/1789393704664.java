class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax= 0;
        int l = 0;
        int r = height.length - 1;

        int totalWater = 0;

        while (l < r) {
            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);

            int minHeight = Math.min(leftMax, rightMax);
            if (height[l] < height[r]) {
                totalWater +=  minHeight - height[l++];
            } else {