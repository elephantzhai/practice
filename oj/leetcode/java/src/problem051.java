import java.util.ArrayList;
import java.util.List;


public class problem051 {

	public static void main(String[] args) {
		int n = 4;
		List<String[]> resList = solveNQueens(n);
		for(int i=0;i<resList.size();i++){
			System.out.println("solution:"+i);
			String[] resStrings = resList.get(i);
			for(int j = 0;j<resStrings.length;j++){
				System.out.println(resStrings[j]);
			}
 		}
	}
	
	public static List<String[]> solveNQueens(int n) {
        ArrayList<String[]> reStrings = new ArrayList<String[]>();
        solve(n, 0, new int[n], reStrings);
        return reStrings;
    }
	
	public static void solve(int n,int row,int[] colum,List<String[]> res){
		if(row == n){
			String[] strings = new String[n];
			for(int i=0;i<n;i++){
				StringBuilder sb = new StringBuilder();
				for(int j=0;j<n;j++){
					if(colum[i] == j){
						sb.append('Q');
					}else{
						sb.append('.');
					}
				}
				strings[i] = sb.toString();
			}
			res.add(strings);
			return;
		}
		for(int i=0;i<n;i++){
			colum[row] = i;
			if(check(row, colum)){
				solve(n, row+1, colum, res);
			}
			
		}
	}
	
	public static boolean check(int row,int[] colum){
		for(int i=0;i<row;i++){
			if(colum[i] == colum[row] || Math.abs(colum[i]-colum[row]) == Math.abs(i - row)){
				return false;
			}
		}
		return true;
	}

}
