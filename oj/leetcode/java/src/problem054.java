import java.util.ArrayList;
import java.util.List;


public class problem054 {

	public static void main(String[] args) {
//		int[][] matrix = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
		int[][] matrix = {{7},{9},{6}}; 
		List<Integer> resIntegers = spiralOrder(matrix);
		for(int i=0;i<resIntegers.size();i++){
			System.out.print(resIntegers.get(i)+" ");
		}
		System.out.println();

	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    int N = matrix.length;
	    if(N == 0){
	    	return res;
	    }
	    int M = matrix[0].length;
	    int m = M-1 , n = N-1;
	    int times = (Math.min(M, N))/2;
	    for(int time = 0;time<times;time++){
	    	for (int i = time; i <= m; i++) {
				res.add(matrix[time][i]);
			}
	    	for(int i=time+1;i<n;i++){
	    		res.add(matrix[i][m]);
	    	}
	    	for(int i = m;i>=time;i--){
	    		res.add(matrix[n][i]);
	    	}
	    	for(int i = n-1;i>=time+1;i--){
	    		res.add(matrix[i][time]);
	    	}
	    	m--;
	    	n--;
	    }
	    if(N%2 ==1 && M%2 == 1){
	    	if(N>M){
	    		for(int i = times;i<=n;i++){
		    		res.add(matrix[i][m]);
		    	}
	    	}else{
	    		for(int i = times;i<=m;i++){
		    		res.add(matrix[n][i]);
		    	}
	    	}
	    	
	    }else if(N%2 == 1){
	    	//row
	    	for(int i = times;i<=m;i++){
	    		res.add(matrix[n][i]);
	    	}
	    	
	    }else if (M%2 == 1) {
			//columns
	    	for(int i = times;i<=n;i++){
	    		res.add(matrix[i][m]);
	    	}
		}
	        
	    return res;
	}

}
