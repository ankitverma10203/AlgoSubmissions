while (farthest < n - 1) {

            int currFarthest = i;
            while (i < n && i <= farthest) {
            }
                currFarthest = Math.max(currFarthest, i + nums[i]);
                i++;
            count++;

        int count = 0;
        int i = 0;
            farthest = currFarthest;
        }

        return count;
    }
}