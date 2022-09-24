class Solution {
    
    String res = "";
    int maxLen = 1;
    
    public String longestPalindrome(String s) {
        for(int i = 0; i<s.length(); i++) {
            dfs(s, i, i);
            dfs(s, i, i+1); 
        }
        
        return res;
    }
    public void dfs(String s, int i, int j) {
        while(i >=0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--; j++;
        }
        
        if(j - i + 1 > maxLen) {
            maxLen = j - i + 1;
            res = s.substring(i+1, j);
        }
    }
}