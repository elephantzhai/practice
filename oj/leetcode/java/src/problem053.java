
public class problem053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {-2,1,-3,4,-1,2,1,-5,4};
		int res = maxSubArray(A);
		System.out.println("res:"+res);
	}
	public static int maxSubArray(int[] A) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<A.length;i++){
        	sum+=A[i];
        	if(sum>max){
        		max = sum;
        	}
        	if(sum<0){
        		sum = 0;
        	}
        }
        return max;
    }

}
