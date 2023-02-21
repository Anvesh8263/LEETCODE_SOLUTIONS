class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int[][] sum = new int[t.size()][t.get(t.size() - 1).size()];
        sum[0][0] = t.get(0).get(0);
        for (int i = 0; i < t.size() - 1; i++) {
            List<Integer> listCurr = t.get(i), listNext = t.get(i + 1);
            for (int j = 0; j < listCurr.size(); j++) {
                int curr = sum[i][j];
                if (j == 0) {
                    sum[i + 1][j] = curr + listNext.get(j);
                } else {
                    sum[i + 1][j] = Math.min(sum[i + 1][j], curr + listNext.get(j));
                }
                sum[i + 1][j + 1] = curr + listNext.get(j + 1);
            }
        }
        int min = 100_000;
        for (int n : sum[sum.length - 1]) if (min > n) min = n;
        return min;
    }
}