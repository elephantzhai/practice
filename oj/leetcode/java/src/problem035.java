
public class problem035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,3,5,6};
		int target = 0;
		int pos = searchInsert(A, target);
		System.out.println("Pos:"+pos);
	}
	
	public static int searchInsert(int[] A, int target) {
		int pos = -1;
		int lower = 0;
		int n = A.length;
		int upper = n;
		int mid = 0;
		while(lower<upper){
			mid = (lower+upper)/2;
			if(A[mid] == target){
				pos = mid;
				break;
			}
			if(mid>lower && A[mid]>target && A[mid-1]<target){
				pos = mid;
				break;
			}
			if (A[mid]<target) {
				lower = mid+1;
			}else{
				upper = mid-1;
			}
//			System.out.println("lower:"+lower+" mid:"+mid+" upper:"+upper);
		}
		if(pos == -1){
			pos = lower;
			
		}
		
		return pos;
    }

}
