class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();


        for (int num : set) {
            if (set.contains(num - 1)) continue;

        for (int num : nums) {
            set.add(num);
        }
            int curr = num;
            int count = 0;
            
        }

            while (set.contains(curr++)) {
                count++;
            }
    }

            max = Math.max(max, count);

        int max = 0;

        return max;