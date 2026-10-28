curr = curr.children[idx];
        }

        return curr.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            if (curr.children[idx] == null) return false;

            int idx = ch - 'a';
            char ch = word.charAt(i);
        for (int i = 0; i < word.length(); i++) {

    public boolean search(String word) {
        TrieNode curr = root;
    
    }