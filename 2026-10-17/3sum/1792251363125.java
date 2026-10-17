int l = i + 1;
            int r = n - 1;
            if (i > 0 && first == nums[i - 1]) continue;

            while (l < r) {
                int sum = first + nums[l] + nums[r];

                if (sum == 0)  {
                    res.add(List.of(first, nums[l], nums[r]));
                } else if (sum < 0) {
                    l++;
                    r--;
                if (l > i + 1 && nums[l] == nums[l - 1]) {
                    l++;
                }
                    continue;

            int first = nums[i];
        for (int i = 0; i < n; i++) {

        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;