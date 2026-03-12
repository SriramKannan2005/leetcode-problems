class Solution {
        
    public static void depthFirstSearch(char[][]grid,int i,int j,int row,int col)
    {
        grid[i][j]='0';
        int[][]dir={{0,1},{1,0},{0,-1},{-1,0}};
        for(int x=0;x<4;x++)
        {
            int ni=i+dir[x][0];
            int nj=j+dir[x][1];
            if(ni>=0&&nj>=0&&ni<row&&nj<col&&grid[ni][nj]=='1')
            {
                depthFirstSearch(grid,ni,nj,row,col);
            }

        }

    }

    public int numIslands(char[][] grid) {
       char[][] grid1=grid;
		int row=grid1.length;
		int col=grid1[0].length;
		int count=0;
		for(int i=0;i<row;i++)
		{
		for(int j=0;j<col;j++)
		{
		   if(grid1[i][j]=='1')
		   {
		       depthFirstSearch(grid1,i,j,row,col);
		       count++;
		   }
		   
		}
		
		}

        return count;
    }
}