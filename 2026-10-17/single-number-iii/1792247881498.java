if (!isSet) continue;

            for (int num : nums) {
                if ((num & (1 << i)) != 0) {
                    xor1 ^= num;
                } else {

            boolean isSet = (xor & (1 << i)) != 0;

        for (int i = 0; i <= 32; i++) {
                    xor2 ^= num;
                }
            }

            break;
        }

        return new int[] {xor1, xor2};
    }
}