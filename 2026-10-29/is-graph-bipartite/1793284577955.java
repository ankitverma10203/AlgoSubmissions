if (color[i] != 0) return true;
        if (color[i] != 0 && color[i] == parentColor) return false;
    private boolean dfs(int[][] graph, int[] color, int i, int parentColor) {


        return true;
    }
        }
            if (!dfs(graph, color, i, -1)) return false;
        for (int i = 0; i < n; i++) {

        int[] color = new int[n];

        color[i] = parentColor == 1 ? 2 : 1;