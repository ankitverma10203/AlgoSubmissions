char val = board[i][j];
        board[i][j] = '#';

        Trie.TrieNode prev = curr;
        curr = curr.children[idx];

        if (curr.isWord) {
            ans.add(curr.word);
        }

        for (int[] dir : dirs) {
            int ni = i + dir[0];
            int nj = j + dir[1];

            if (ni >= board.length || ni < 0 || nj < 0 || nj >= board[0].length || board[ni][nj] == '#') continue;

            dfs(board, ni, nj, curr);
        }

        curr = prev;
        board[i][j] = val;
    }