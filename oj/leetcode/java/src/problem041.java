

public class problem041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,4,-1,1};
		int res = firstMissingPositive(A);
		System.out.println("res:"+res);
	}
	public static int firstMissingPositive(int[] A) {
		int length = A.length;
		int temp = 0;
		for(int i=0;i<length;i++){
			if(A[i]>0 && A[i]<length){
				if(A[A[i]-1] != A[i]){
					temp = A[i];
					A[i] = A[temp-1];
					A[temp-1] = temp;
					i--;
				}
				
			}
		}
		for(int i=0;i<length;i++){
			if(A[i]-1 != i){
				return i+1;
			}
		}
        return length+1;
    }
	
	

}
