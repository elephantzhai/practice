

public class problem036 {

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
		boolean res = isValidSudoku(map);
		System.out.println("res:"+res);
	}
	
	public static boolean isValidSudoku(char[][] board) {
		int[] row = new int[9];
		int[] col = new int[9];
		for(int i = 0;i<9;i++){
			row = new int[9];
			col = new int[9];
			for(int j = 0;j<9;j++){
				if(board[i][j] != '.'){
					if(row[board[i][j]-49] == 1){
						return false;
					}
					row[board[i][j]-49]++;
				}
				if(board[j][i] != '.'){
					if(col[board[j][i]-49] == 1){
						return false;
					}
					col[board[j][i]-49]++;
				}
			}
		}
		for(int i=0;i<9;i+=3){
			for(int j=0;j<9;j+=3){
				row = new int[9];
				for(int m = 0;m<3;m++){
					for(int n = 0;n<3;n++){
						if(board[i+m][j+n] != '.'){
							if(row[board[i+m][j+n]-49] == 1){
								return false;
							}
							row[board[i+m][j+n]-49]++;
						}
					}
				}
			}
		}
        return true;
    }

}
