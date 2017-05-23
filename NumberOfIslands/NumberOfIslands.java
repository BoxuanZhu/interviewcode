public class Solution {
    public int numIslands(char[][] grid) {
        int rst = 0;
        for(int i = 0; i < grid.length; i ++){
            for(int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == '1'){
                    rst ++;
                    update(grid, i , j);
                }
            }
        }
        return rst;
    }
    private void update(char[][] grid, int i,int j){
        if(i < grid.length && i >= 0 && j < grid[i].length && j >= 0 && grid[i][j] == '1'){
            grid[i][j] = '0';
            update(grid, i-1,j);
            update(grid, i+1,j);
            update(grid, i,j-1);
            update(grid, i,j+1);
        }
    }
}