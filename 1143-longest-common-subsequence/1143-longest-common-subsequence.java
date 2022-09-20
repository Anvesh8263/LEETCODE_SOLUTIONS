class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char str1[] = text1.toCharArray();
              char str2[] = text2.toCharArray();
        int dp[][] = new int[text1.length()+1][text2.length()+1];
            dp[0][0]=0;
        for(int i =1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(str1[i-1]==str2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
                
// digonal +1 if the character match

