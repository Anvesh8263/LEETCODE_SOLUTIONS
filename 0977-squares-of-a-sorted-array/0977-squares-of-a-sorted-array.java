class Solution {
    public int[] sortedSquares(int[] B) {
        int m = B.length;
        int[] result = new int[m];
        int i = 0, j = m - 1;
        for (int p = m - 1; p >= 0; p--) {
            if (Math.abs(B[i]) > Math.abs(B[j])) {
                result[p] = B[i] * B[i];
                i++;
            } else {
            result[p] = B[j] * B[j];
                j--;
            }
             }
        return result;
    }
}