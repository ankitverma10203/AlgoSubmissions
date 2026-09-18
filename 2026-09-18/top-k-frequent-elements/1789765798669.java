minHeap.offer(new int[] {entry.getKey(), entry.getValue()});
        }

        int[] res = new int[minHeap.size()];

        int i = 0;

            if (minHeap.size() > k) minHeap.poll();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

class Solution {
    public int[] topKFrequent(int[] nums, int k) {