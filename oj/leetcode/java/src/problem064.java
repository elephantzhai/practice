public class problem064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {
				{1,2,1},
				{1,3,2},
				{4,2,1}
		};
		int res = minPathSum(grid);
		System.out.println("res:"+res);
	}

	public static int minPathSum(int[][] grid) {
		int n = grid.length;
        if(n==0){
        	return 0;
        }
        int m = grid[0].length;
        int[] line = new int[m];
        line[0] = grid[0][0];
        for(int i=1;i<m;i++){
        	line[i] = line[i-1]+grid[0][i];
        }
        for(int i=1;i<n;i++){
        	line[0]+=grid[i][0];
        	for(int j=1;j<m;j++){
        		line[j] = Math.min(line[j], line[j-1])+grid[i][j];
        	}
        }
        return line[m-1];
	}
	
	public static void print(int[] list){
		for(int i=0;i<list.length;i++){
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}

}
