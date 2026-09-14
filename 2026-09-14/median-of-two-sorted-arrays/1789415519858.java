class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;

        if (len2 < len1) return findMedianSortedArrays(nums2, nums1);

        int partition = (len1 + len2 + 1) / 2;
        int totalLen = len1 + len2;

        int start = 0;
        int end = len1;

        while (start <= end) {
            int cut1 = start + (end - start) / 2;
            int cut2 = partition - cut1;