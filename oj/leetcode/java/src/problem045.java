
public class problem045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,3,1,1,4};
		int n = 5;
		int ret = jump(A, n);
		System.out.println("res:"+ret);
	}
	
	public static int jump(int A[], int n) {
		if (n == 1){
			return 0;
		}
		int start = 0;
		int end = 0;
		int count = 0;
		int max = 0;
		while(end<n){
			count++;
			max = 0;
			for(int i=start;i<=end;i++){
				if(A[i]+i>=n-1){
					return count;
				}
				if(A[i]+i>max){
					max = A[i]+i;
				}
			}
			start = end+1;
			end = max;
		}
        return 0;
    }

}
