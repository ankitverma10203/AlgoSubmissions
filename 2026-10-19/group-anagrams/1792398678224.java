class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> grp = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for (String str : strs) {
            String hash = getHash(str);
            grp.computeIfAbsent(hash, k -> new ArrayList<>()).add(str);
        }

        for (Map.Entry<String, List<String>> e : grp.entrySet()) {
            ans.add(e.getValue());
        }

        return ans;
    }

    private String getHash(String str) {
        char[] freq = new char[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            freq[ch - 'a']++;
        }