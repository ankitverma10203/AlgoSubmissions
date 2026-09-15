class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        PriorityQueue<int[]> active = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        int totalPassenger = 0;

        Arrays.sort(trips, (a, b) -> a[1] == b[1] ? Integer.compare(a[2], b[2]) : Integer.compare(a[1], b[1]));

        for (int[] trip : trips) {
            while (!active.isEmpty() && active.peek()[2] <= trip[1]) {
                int[] expired = active.poll();
                totalPassenger -= expired[0];
            }

            active.offer(trip);
            totalPassenger += trip[0];

            if (totalPassenger > capacity) return false;
        }