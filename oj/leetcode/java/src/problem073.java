import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class problem073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = {
				{1,2,3,4,0},
				{0,2,3,4,0},
				{1,2,3,3,1}
		};
		setZeroes(m);
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void setZeroes(int[][] matrix) {
		int rowSize = matrix.length;
		int colSize = matrix[0].length;
        HashSet<Integer> row = new HashSet<Integer>();
        HashSet<Integer> col = new HashSet<Integer>();
        for(int i=0;i<rowSize;i++){
        	for(int j = 0;j<colSize;j++){
        		if(matrix[i][j] == 0){
        			row.add(i);
        			col.add(j);
        		}
        	}
        }
        
        Iterator<Integer> rowIt = row.iterator();
        while(rowIt.hasNext()){
        	int rowNum = rowIt.next();
        	for(int i=0;i<colSize;i++){
        		matrix[rowNum][i] = 0;
        	}
        }
        
        Iterator<Integer> colIt = col.iterator();
        while(colIt.hasNext()){
        	int colNum = colIt.next();
        	for(int i=0;i<rowSize;i++){
        		matrix[i][colNum] = 0;
        	}
        }
        
        
    }

}
