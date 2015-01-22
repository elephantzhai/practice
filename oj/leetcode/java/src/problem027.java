
public class problem027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] A = {1,1,2};
		int[] A  ={1};
		int target = 1;
		int len = removeElement(A,target);
		System.out.println(len);
		for(int i=0;i<len;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}

	public static int removeElement(int[] A,int elem) {
		int length = A.length;
		int sum = length;
		if(length <= 0){
			return length;
		}
		int j = 0;
		
		for(int i=0;i<length;i++){
			
			if (A[i] == elem){
				sum--;
			}else{
				if(i!=j){
					A[j] = A[i];
				}
				j++;
			}
			
		}
		return sum;
	}

}
