
public class program055 {

	public static void main(String[] args) {
//		int[] A = {2,3,1,1,4};
		int[] A = {3,2,1,0,4};
		boolean isCan = canJump(A);
		System.out.println("isCan:"+isCan);
	}
	public static boolean canJump(int[] A) {
		int max = 0;
		int len = A.length;
		for(int i= 0 ;i<=max&&i<len;i++){
			if(A[i]+i>max){
				max = A[i]+i;
			}
			if(max>=len-1){
				return true;
			}
		}
        return false;
    }

}
