class Solution {
    public int totalNQueens(int n) {
        char board[][] = new char[n][n];
        return nQueens(board, 0);
    }
    public static boolean isSafe(char board[][], int row, int col) {
		//vertical up
		for(int i = row-1; i>=0; i--) {
			if(board[i][col] == 'Q') {
				return false;
			}
		}
		//diagonal left up
		for(int i = row-1, j=col-1; i>=0 && j >=0 ; i--, j--) {
			if(board[i][j]=='Q') {
				return false;
			}
		}
		//diagonal right up
		for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
			if(board[i][j] =='Q') {
				return false;
			}
		}
		return true;
		
	}
	public static int nQueens(char board[][], int row) {

		//base case
		if(row==board.length) {
			//printBoard(board);
			return 1;
		}
        int count=0;
		//coloumn loooop
		for(int j=0; j<board.length; j++) {
				if(isSafe(board,row, j)) {
				board[row][j] = 'Q';
				count += nQueens(board, row+1); // function call
				board[row][j] = '.'; //backtracking
			}
			
		}
        return count;
		
	}
}