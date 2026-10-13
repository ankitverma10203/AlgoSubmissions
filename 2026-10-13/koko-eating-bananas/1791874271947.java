return ans;
    }

    private boolean isPossible(int k, int[] piles, int h) {
        int t = 0;

        for (int pile : piles) {
            t += pile / k;


            if (pile % k != 0) t++;
        }

            if (t > h) return false;

        return t <= h;
    }
}

        }