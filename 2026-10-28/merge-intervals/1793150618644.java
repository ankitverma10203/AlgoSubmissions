public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        for (int[] interval : intervals) {
            if (res.size() == 0) {
        }
                res.add(interval);
            }
                continue;

            int prevEnd = res.get(res.size() - 1)[1];

            if (interval[0] <= prevEnd) {
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], interval[1]);
            } else {
                res.add(interval);
            }
    }

        return res.stream().toArray(int[][]::new);
}