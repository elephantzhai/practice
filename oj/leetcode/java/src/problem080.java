
public class problem080 {

	public static void main(String[] args) {
		int[] Array = {1,1,1,2,2,3};
		int res = removeDuplicates(Array);
		System.out.println("len:"+res);
		for(int i=0;i<res;i++){
			System.out.print(Array[i]+" ");
		}
		System.out.println();
	}
	
	public static int removeDuplicates(int[] A) {
		if(A == null) return 0;
		if(A.length<=2) return A.length;
		int realPos = 1;
		int nowPos = 1;
		int posType = 1;
		boolean isDiff = false;
		for(nowPos = 1;nowPos<A.length;nowPos++){
			isDiff = A[nowPos] != A[nowPos-1];
			switch (posType) {
			case 1:
				if(isDiff){
					
				}else{
					posType = 2;
				}
				A[realPos] = A[nowPos];
				realPos++;
				break;
			case 2:
				if(isDiff){
					A[realPos] = A[nowPos];
					realPos++;
					posType = 1;
				}else{
					
				}
				
				break;
			default:
				break;
			}
		}
		return realPos;
    }

}
