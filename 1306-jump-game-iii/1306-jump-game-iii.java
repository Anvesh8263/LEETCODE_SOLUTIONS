class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        return dfs(arr, start, visited);
    }

    private boolean dfs(int[] arr, int index, boolean[] visited) {
        // Base cases
        if (index < 0 || index >= arr.length || visited[index])
            return false;
        if (arr[index] == 0)
            return true;

        visited[index] = true;

        // Recursive cases
        return dfs(arr, index + arr[index], visited) || dfs(arr, index - arr[index], visited);
    }
}
