List<int[]> res = new ArrayList<>();

        for (int[] interval : intervals) {
            if (res.size() == 0) {
        }
                res.add(interval);
            }
                continue;

            int prevEnd = lastInterval[1];

            if (interval[0] <= prevEnd) {
                lastInterval[1] = Math.max(prevEnd, interval[1]);
            } else {
                res.add(interval);
            }

        return res.stream().toArray(int[][]::new);
            int[] lastInterval = res.get(res.size() - 1);
    }
}