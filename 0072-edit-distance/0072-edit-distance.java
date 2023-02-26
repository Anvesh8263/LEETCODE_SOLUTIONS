class Solution {
    public int minDistance(String w1, String w2) {
        int l1 = w1.length();
        int l2 = w2.length();
        
        int[][] dp = new int[l1][l2];
        for(int i = 0 ; i < l1 ; i++)
            for(int j = 0 ; j < l2 ; j++)
                dp[i][j] = -1;
        return dist(w1 , w2 , l1-1, l2-1 , dp);    
    }
    
    public int dist(String s1, String s2 , int i , int j , int[][] dp){
        if(i < 0)   return j+1;
        if(j < 0) return i+1;
        
        if(dp[i][j] != -1)
            return dp[i][j];
        
        if(s1.charAt(i) == s2.charAt(j))    return dp[i][j] = dist(s1 , s2 , i-1 , j-1 , dp);
        
        return dp[i][j] = 1+Math.min(dist(s1 , s2 , i , j-1 , dp) , Math.min(dist(s1 , s2 , i-1 , j , dp) , dist(s1 , s2 , i-1 , j-1 , dp)));
    }
}