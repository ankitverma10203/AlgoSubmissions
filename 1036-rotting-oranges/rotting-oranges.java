class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] dirs = new int[][] {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        Queue<int[]> rotten = new ArrayDeque<>();

        int freshCount = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) freshCount++;
                else if (grid[i][j] == 2) rotten.offer(new int[] {i, j});
            }
        }

        if (freshCount == 0) return 0;

        int time = 0;

        while (!rotten.isEmpty() && freshCount > 0) {

            int size = rotten.size();

            while (size-- > 0) {
                int[] cell = rotten.poll();
                int i = cell[0];
                int j = cell[1];

                for (int[] dir : dirs) {
                    int ni = i + dir[0];
                    int nj = j + dir[1];

                    if (ni < 0 || nj < 0 || ni >= m || nj >= n || grid[ni][nj] != 1) continue;

                    grid[ni][nj] = 2;
                    freshCount--;
                    rotten.offer(new int[] {ni, nj});
                }
            }

            time++;
        }

        return freshCount > 0 ? -1 : time;
    }
}