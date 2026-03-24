class Solution {
    int maxCount=0;
     public int  backtrack(int [][] grid, int row, int col){
        
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0)
        {
            return 0;
        }
        
       grid[row][col]=0;
        int count=1;
        
        count+=backtrack(grid,row+1,col);
        count+=backtrack(grid,row,col+1);
        count+=backtrack(grid,row-1,col);
        count+=backtrack(grid,row,col-1);
       
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
         if(grid == null || grid.length == 0)
        {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j] == 1)
                {
                   int area= backtrack(grid,i,j);
                   maxCount=Math.max(maxCount,area);
                    
                }
            }
        }
        return maxCount;
        
    }
}