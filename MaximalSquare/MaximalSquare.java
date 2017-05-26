public class Solution {
    public int maximalSquare(char[][] matrix) {
        /*run in O(n^2), key idea is the diagnol value is the same as the square size*/
        if(matrix== null || matrix.length <= 0)
            return 0;
        int [][] dp = new int[matrix.length+1][(matrix[0].length +1)];
        int max = 0;
        for(int i = 0; i < matrix.length; i ++){
            int m = i +1;//index for dp array
            for(int j = 0; j < matrix[0].length; j ++){
                int n = j +1;// index for dp array
                if(matrix[i][j] == '1'){
                    int min = min(dp[m-1][n], dp[m-1][n-1], dp[m][n-1]);
                    dp[m][n] = min + 1;
                    max = max > dp[m][n]? max:dp[m][n];
                }
                
            }
        }
      //  for(int i = 0; i < dp.length; i ++){
        //    for(int j = 0; j < dp[0].length; j ++){
          //      System.out.print(dp[i][j]);
            //}
            //System.out.println();
        //}
        return max*max;// return the area
    }
    private int min(int a, int b, int c){
        int  min = a < b? a :b;
        min = min < c? min:c;
        return min;
    }
}