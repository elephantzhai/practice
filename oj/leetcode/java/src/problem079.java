
public class problem079 {

	public static void main(String[] args) {
		char[][] board = {
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}
		};
		String wordString = "ABCCED";
//		String wordString ="SEE";
//		String wordString = "ABCB";
		boolean res = exist(board, wordString);
		System.out.println("res:"+res);
		
	}
	
	public static boolean exist(char[][] board, String word) {
		if(board == null ) return false;
		if(word.isEmpty()) return true;
		int[][] visit = new int[board.length][board[0].length];
		char[] wordChar = word.toCharArray();
		for(int i = 0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				if(findWord(i, j, 0, wordChar, board, visit)){
					return true;
				}
			}
		}
        return false;
    }
	
	public static boolean findWord(int row,int col,int pos,char[] word,char[][] map,int[][] visit){
		if(pos == word.length) return true;
//		System.out.println(row+" "+col+" "+pos);
		if(row<0 || row>=map.length || col<0 || col>=map[0].length || visit[row][col] == 1 || map[row][col] != word[pos]) return false;
		
		visit[row][col] = 1;
		if(findWord(row+1, col, pos+1, word, map, visit)) return true;
		if(findWord(row-1, col, pos+1, word, map, visit)) return true;
		if(findWord(row, col+1, pos+1, word, map, visit)) return true;
		if(findWord(row, col-1, pos+1, word, map, visit)) return true;		
		visit[row][col] = 0;
		return false;
	}

}


