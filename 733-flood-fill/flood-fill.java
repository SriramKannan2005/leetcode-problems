class Solution 
{
    public static void backtrack(int[][]grid,int ncolor,int precolor,int row,int col)
    {
       if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != precolor)
        {
            return;
        }
        grid[row][col] = ncolor;
        backtrack(grid,ncolor,precolor,row+1,col);
        backtrack(grid,ncolor,precolor,row,col+1);
        backtrack(grid,ncolor,precolor,row-1,col);
        backtrack(grid,ncolor,precolor,row,col-1);

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        	int [][]grid=image;
		int row=grid.length;
		int col=grid[0].length;
		
		int ncolor=color;
		int precolor=grid[sr][sc];
        if (precolor == ncolor) 
        {
            return grid;
        }
		backtrack(grid,ncolor,precolor,sr,sc);
        return grid;
		}
    }