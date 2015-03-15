
public class problem042 {
	public static void main(String[] args){
		int[] A = {0,1,0,2,1,0,1,3,2,1,2,1};
		int res = trap(A);
		System.out.println("res:"+res);
	}
	public static int trap(int[] A) {
		int len = A.length;
		if(len<=2){
			return 0;
		}
		int[] maxL = new int[len];
		int[] maxR = new int[len];
		
		int max = A[0];
		maxL[0] = 0;
		for(int i=1;i<len;i++){
			maxL[i] = max;
			if(max<A[i]){
				max = A[i];
			}
		}
		
		max = A[len-1];
		maxR[len-1] = 0;
		int sum = 0;
		int delta = 0;
		for(int i= len-2;i>=0;i--){
			maxR[i] = max;
			if(max<A[i]){
				max = A[i];
			}
			delta = Math.min(maxL[i], maxR[i])-A[i];
			if(delta>0){
				sum+=delta;
			}
		}
		
				
		return sum;
    }
}
