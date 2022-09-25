class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            sb[i] = new StringBuilder();
        }
        int n = s.length();
        char[] arr = s.toCharArray();
        int idx = 0;
        while(idx < n){
            // down 
            for(int i = 0; i < numRows && idx < n; i++){
                sb[i].append(arr[idx]);
                idx++;
            }
            // up
            for(int i = numRows -2; i > 0 && idx < n; i--){
                sb[i].append(arr[idx]);
                idx++;
            }
        }
        // merge all stringBuilders
        StringBuilder res = sb[0];
        for(int i = 1; i < numRows; i++){
            res.append(sb[i]);
        }
        return res.toString();
    }
}