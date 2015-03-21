
public class problem059 {
	public static void main(String[] args){
		int n = 3;
		int[][] res = generateMatrix(n);
		int len = res.length;
		for(int i=0;i<len;i++){
			for(int j = 0;j<len;j++){
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] generateMatrix(int n) {
		int len = n;
		int[][] res = new int[n][n];
		int num = 1;
		int times = n/2;
		int time =0;
		for(time = 0;time<times;time++){
			for(int i = time;i<n-time-1;i++,num++){
				res[time][i] = num;
//				System.out.print(time+"/"+i+" ");
			}
//			System.out.println();
			for(int i = time;i<n-time-1;i++,num++){
				res[i][n-1-time] = num;
//				System.out.print(n-1-time+"/"+i+" ");
			}
//			System.out.println();
			for(int i = n-time-1;i>time;i--,num++){
				res[n-1-time][i] = num;
//				System.out.print(i+"/"+(n-1-time)+" ");
			}
//			System.out.println();
			for(int i = n-time-1;i>time;i--,num++){
				res[i][time] = num;
//				System.out.print(i+"/"+time+" ");
			}
//			System.out.println();
		}
		if(n%2==1){
			res[time][time] = num;
			num++;
		}
		return res;
    }
	
	
}
