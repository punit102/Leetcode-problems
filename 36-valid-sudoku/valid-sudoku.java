class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet();
        boolean result = true;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    boolean rowCheck = set.add(board[i][j] + " found at row: " + i);
                    boolean columnCheck = set.add(board[i][j] + " found at column: " + j);
                    boolean boxCheck = set.add(board[i][j] + " found at box: [ " + i / 3 + " ," + j / 3 + "]");
                    if (!rowCheck || !columnCheck || !boxCheck)
                        return false;
                }
            }
        }

        return result;
    }
}

/*
 * NOTE:
 * 
 * HashSet.add()-> when duplicate string comes, it can't add and return false
 * That's why I checked here: if (!rowCheck || !columnCheck || !boxCheck)
 * 
 * System.out.println(board[i][j]+ " found at row: " +i);
 * System.out.println(board[i][j]+ " found at column: " +j);
 * System.out.println(board[i][j]+ " found at box: [ " +i/3+ " ," +j/3 + "]");
 * set.add(board[i][j]+ " found at row: " +i);
 * set.add(board[i][j]+ " found at column: " +j);
 * set.add(board[i][j]+ " found at box: [ " +i/3+ " ," +j/3 + "]");
 * 
 */