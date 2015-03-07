
public class problem037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] map = 
			{{'.','8','7','6','.','.','.','.','.'}
			,{'6','.','.','.','.','.','.','.','.'}
			,{'.','9','8','.','.','.','.','.','.'}
			,{'.','.','.','.','.','.','.','.','.'}
			,{'.','.','.','.','.','.','.','.','.'}
			,{'.','.','.','.','.','.','.','.','.'}
			,{'.','.','.','.','.','.','.','.','.'}
			,{'.','.','.','.','.','.','.','.','.'}
			,{'.','.','.','.','.','.','.','.','.'}};
		boolean ret = solveSudoku1(map);
		System.out.println("ret:"+ret);
	}
	
	public static void solveSudoku(char[][] board) {
        
    }
	
	public static boolean isValue(char[][] board,int x,int y){
		int i,j;
		for(i= 0;i<9;i++){
			if(i != x && board[x][y] == board[i][y]){
				return false;
			}
		}
		for(i= 0;i<9;i++){
			if(i != y && board[x][y] == board[x][i]){
				return false;
			}
		}
		for(i = 3*(x/3);i<3*(x/3+1);i++){
			for(j = 3*(y/3);j<3*(y/3+1);j++){
				if(i!=x && j!=y && board[i][j] == board[x][y]){
					return false;
				}
			}
		}
		
		
		return true;
	}
	
	public static boolean solveSudoku1(char[][] board) {
        for(int i=0;i<9;i++){
        	for(int j=0;j<9;j++){
        		if(board[i][j] == '.'){
        			for(int k = 0;k<9;k++){
        				board[i][j] = (char)('1'+k);
        				if(isValue(board, i, j) && solveSudoku1(board)){
        					return true;
        				}
        				board[i][j] = '.';
        			}
        			return false;
        		}
        	}
        }
        return true;
    }

}
