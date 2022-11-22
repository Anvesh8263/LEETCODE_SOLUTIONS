class Solution {
   public int hammingDistance(int x, int y) {
            int xor = x ^ y;
            int z = 0;

            while (xor != 0) {
                if (xor % 2 ==1) {
                    z++;
                }
                xor = xor >> 1;
            }

            return z;
        }
}