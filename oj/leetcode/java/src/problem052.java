import java.util.ArrayList;


public class problem052 {

	public static void main(String[] args) {
		int n = 4;
		int res = totalNQueens(n);
		System.out.println("res:"+res);
		
	}
	
	public static int totalNQueens(int n) {
		ArrayList<Integer> resArrayList = new ArrayList<Integer>();
		resArrayList.add(0);
        solve(n, 0, new int[n],resArrayList);
        int res = resArrayList.get(0);
		return res;
    }
	
	public static void solve(int n,int row,int[] colum,ArrayList<Integer> list){
		if(row == n){
			list.set(0, list.get(0)+1);
			return;
		}
		for(int i=0;i<n;i++){
			colum[row] = i;
			if(check(row, colum)){
				solve(n, row+1, colum, list);
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

