while (need != have && r < s2.length()) {
            char right = s2.charAt(r);
        int r = s1.length();

        int l = 0;
            char left = s2.charAt(l);
            
            int li = left - 'a';
            int ri = right - 'a';
            b[li]--;
            if (b[li] < a[li]) have--;
            if (b[ri] <= a[ri]) have++;

            l++;
            r++;
        }

        return need == have;
    }

            b[ri]++;
}