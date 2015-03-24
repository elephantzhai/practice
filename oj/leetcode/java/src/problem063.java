
public class problem063 {
	public static void main(String[] args) {
		
		int[][] map = {
				{0,0,0},
				{0,1,0},
				{0,0,0}
		};
		
		int res2 = uniquePathsWithObstacles(map);
		System.out.println("res2:"+res2);
		
	}
	
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        if(n==0){
        	return 0;
        }
        int m = obstacleGrid[0].length;
        int[] line = new int[m];
        for(int i=0;i<m;i++){
        	if(obstacleGrid[0][i] == 1){
        		line[i] = 0;
        		break;
        	}else{
        		line[i] = 1;
        	}
        }
        for(int i=1;i<n;i++){
        	if(obstacleGrid[i][0] == 1){
        		line[0] = 0;
        	}
        	for(int j=1;j<m;j++){
        		if(obstacleGrid[i][j] == 1){
        			line[j] =0;
        		}else{
        			line[j]+=line[j-1];
        		}
        		
        	}
        }
        return line[m-1];
        
    }
}
