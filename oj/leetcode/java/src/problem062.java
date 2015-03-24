
public class problem062 {

	public static void main(String[] args) {
		int m,n;
		m=3;n=7;
		int res = uniquePaths(m, n);
		System.out.println("res:"+res);
		
	}
	
	public static int uniquePaths(int m, int n) {
        int[] line = new int[m];
        for(int i=0;i<m;i++){
        	line[i] = 1;
        }
        for(int i=1;i<n;i++){
        	for(int j=1;j<m;j++){
        		line[j]+=line[j-1];
        	}
        }
        return line[m-1];
    }

}
