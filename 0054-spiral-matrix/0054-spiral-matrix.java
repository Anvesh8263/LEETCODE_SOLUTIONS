class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int y = 0, x = 0;
        boolean hasNextMove = true;
        List<Integer> list = new ArrayList<>(matrix.length * matrix[0].length);
        list.add(matrix[y][x]);
        matrix[y][x] = 101;
        while (hasNextMove) {
            boolean moveMade = false;
            while (moveExists(y, x+1, matrix)) {
                x++;
                list.add(matrix[y][x]);
                matrix[y][x] = 101;
                moveMade = true;
            }
            while (moveExists(y+1, x, matrix)) {
                y++;
                list.add(matrix[y][x]);
                matrix[y][x] = 101;
                moveMade = true;
            }
            while (moveExists(y, x-1, matrix)) {
                x--;
                list.add(matrix[y][x]);
                matrix[y][x] = 101;
                moveMade = true;
            }
            while (moveExists(y-1, x, matrix)) {
                y--;
                list.add(matrix[y][x]);
                matrix[y][x] = 101;
                moveMade = true;
            }
            if (moveMade) continue;
            hasNextMove = false;
        }
        return list;
    }

    private boolean moveExists(int row, int col, int[][] grid) {
        return row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] != 101;
    }
}