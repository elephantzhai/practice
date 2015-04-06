
public class problem074 {

	public static void main(String[] args) {
		int[][] matrix = {
		                  {1,   3,  5,  7},
		                  {10, 11, 16, 20},
		                  {23, 30, 34, 50}
		};
		int target = 31;
		boolean res = searchMatrix(matrix, target);
		System.out.println("res:"+res);
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean isFind = false;
        int targetRow = -1;
        for(int i=0;i<rows;i++){
        	if(matrix[i][0] == target){
        		isFind = true;
        		break;
        	}else if (matrix[i][0]>target) {
				targetRow = i-1;
				break;
			}else{
				if(i == rows-1){
					targetRow = i;
				}
			}
        }
        if(!isFind){
        	if (targetRow == -1) {
				isFind = false;
			}else{
				int targetCol = -1;
				for(int j=0;j<cols;j++){
					if(matrix[targetRow][j]== target){
						isFind = true;
						targetCol = j;
						break;
					}else if (matrix[targetRow][j]>target) {
						isFind =false;
						break;
					}
					
				}
				if(!isFind && targetCol == -1){
					isFind = false;
				}
			}
        }
        return isFind;
    }

}
