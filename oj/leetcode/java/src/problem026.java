
public class problem026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,1,2};
		int len = removeDuplicates(A);
		System.out.println(len);
		for(int i=0;i<len;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}

	public static int removeDuplicates(int[] A) {
		int length = A.length;
		int sum = length;
		if(length <= 1){
			return length;
		}
		int j = 1;
		int lastNum = A[0],curNum = 0;
		for(int i=1;i<length;i++){
			curNum = A[i];
			if (lastNum == curNum){
				sum --;
			}else{
				A[j] = curNum;
				j++;
				lastNum = curNum;
			}
			
		}
		return sum;
	}

}
