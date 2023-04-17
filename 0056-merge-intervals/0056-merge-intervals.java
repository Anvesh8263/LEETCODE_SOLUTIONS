class Solution {
    
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a1,a2)-> a1[0]-a2[0]); 

        Stack<int[]> stack = new Stack<>(); 
        stack.push(intervals[0]);
        int i=1;
        while(!stack.isEmpty() && i < intervals.length){ 
            int[] current = stack.peek();
            int[] next = intervals[i++];
            if(current[1]>=next[0]){
                stack.pop();
                current[1] = Math.max(current[1], next[1]);
                stack.push(current);
            }else{
                stack.push(next);
            }
        }

        return stack.toArray(new int[stack.size()][2]);
    }
}