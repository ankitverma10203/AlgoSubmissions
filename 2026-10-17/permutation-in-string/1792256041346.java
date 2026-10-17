char right = s2.charAt(r);
        while (r < s2.length()) {

        int l = 0;
        int r = s1.length();

        if (isMatch(a, b)) return true;
            char left = s2.charAt(l);

            b[left - 'a']--;
            b[right - 'a']++;

            if (isMatch(a, b)) return true;
            l++;
            r++;
        }

        return false;
    }

    private boolean isMatch(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;