class Solution 
{
    public static void depthFirstSearch(int[][]grid,int i,int j,int ncolor,int precolor,int row,int col)
    {
        grid[i][j]=ncolor;
        int[][]dir={{0,1},{1,0},{0,-1},{-1,0}};
        for(int x=0;x<4;x++)
        {
            int ni=i+dir[x][0];
            int nj=j+dir[x][1];
            if(ni>=0&&nj>=0&&ni<row&&nj<col&&grid[ni][nj]==precolor)
            {
                depthFirstSearch(grid,ni,nj,ncolor,precolor,row,col);
            }

        }

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
		depthFirstSearch(grid,sr,sc,ncolor,precolor,row,col);
        return grid;
		}

		

        
    }