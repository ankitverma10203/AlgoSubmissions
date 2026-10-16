if (a <= n && nums[a - 1] > 0) {
                nums[a - 1] *= -1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans = i + 1;
                break;
            }
        }

        return ans;
    }
}