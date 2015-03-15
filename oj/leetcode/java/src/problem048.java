


public class problem048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] image = {{1,2},{3,4}};
		rotate(image);
		print(image);
		
	}
	public static void rotate(int[][] matrix) {
        int len = matrix.length;
        for(int i=0,j=0;i<len;i++){
        	for(j=0;j<len-1-i;j++){
        		swap(matrix, i, j, len-1-j, len-1-i);
        	}
        }
        print(matrix);
        System.out.println("up dong");
        for(int i=0,j=0;i<len/2;i++){
        	for(j=0;j<len;j++){
        		swap(matrix, i, j, len-1-i, j);
        	}
        }
    }
	
	public static void swap(int[][] map,int i1,int j1,int i2,int j2){
		System.out.println("swap: "+i1+" "+j1+" / "+i2+" "+j2);
		map[i1][j1] += map[i2][j2];
		map[i2][j2] = map[i1][j1] - map[i2][j2];
		map[i1][j1] -= map[i2][j2];
	}
	
	public static void print(int[][] map){
		System.out.println("print begin");
		int len = map.length;
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("print end");
	}

}
