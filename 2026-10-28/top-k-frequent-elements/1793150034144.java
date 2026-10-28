freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(freq.get(a), freq.get(b)));

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            pq.offer(e.getKey());
        }
            
            if (pq.size() > k) pq.poll();

        int[] res = new int[k];

        while (!pq.isEmpty()) {
            res[i++] = pq.poll();
        }
        int i = 0;

        for (int num : nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();
    public int[] topKFrequent(int[] nums, int k) {
class Solution {