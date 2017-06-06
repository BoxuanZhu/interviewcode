public class Solution {
    public boolean isMatch(String s, String p) {
        char [] str = s.toCharArray();
        char [] pattern = p.toCharArray();
        int cur = 0;
        boolean first = true;
        for(int i = 0; i < pattern.length; i ++){
            if(pattern[i] == '*'){
                if(first){
                    pattern[cur++] = pattern[i];
                    first = false;
                }
            }
            else{
                pattern[cur++] = pattern[i];
                first = true;
            }
            
        }
        for(int i = 0 ; i < cur; i ++)
            System.out.println(pattern[i]);
        boolean [][] dp = new boolean[str.length + 1][cur + 1];
        if(cur > 0 && pattern[0] == '*')
            dp[0][1] = true;
        dp[0][0] = true;
        for(int i = 1 ; i < dp.length; i ++){
            for(int j = 1; j < dp[0].length; j ++){
                if(str[i-1] == pattern[j-1] || pattern[j-1] == '?' )
                    dp[i][j] = dp[i-1][j -1];
                else if(pattern[j-1] == '*')
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
            }
        }
        return dp[str.length][cur];
    }
    
}