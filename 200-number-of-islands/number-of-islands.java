class Solution {

    int row;
    int col;


    private boolean checkValidIndex(int i, int j, char[][] grid) {
        if(i < 0 || i >= row || j < 0 || j >= col || grid[i][j] == '0') return false;
        else return true;
    }

    private void dfsRec(int i, int j, char[][] grid){
        
       if (checkValidIndex(i, j, grid)) {
            grid[i][j] = '0';
            dfsRec(i+1, j, grid);
            dfsRec(i-1, j, grid);
            dfsRec(i, j+1, grid);
            dfsRec(i, j-1, grid);
       }

    }

    public int numIslands(char[][] grid) {
        int count = 0;
        if(grid == null || grid.length == 0) return 0;

        row = grid.length;
        col = grid[0].length;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfsRec(i, j, grid);
                }
            }
        }

        return count;
    }
}