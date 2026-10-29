grid[i][j] = '#';

        for (int[] dir : dirs) {
            int ni = i + dir[0];
            int nj = j + dir[1];

            if (ni < 0 || ni >= grid.length || nj < 0 || nj >= grid[0].length || grid
            [ni][nj] != '1') continue;

            dfs(grid, ni, nj);
        }
    }
}
    private void dfs(char[][] grid, int i, int j) {

    }