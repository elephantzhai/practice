
public class problem081 {

	public static void main(String[] args) {
		int[] array = {1,3,1,1,1};
		int target = 2;
		boolean isFound = search(array, target); 
		System.out.println("res:"+isFound);
	}
	
	public static boolean search(int[] A, int target) {
		int start = 0;
		int end = A.length-1;
		int mid;
		while(start <= end){
			mid = (start+end)/2;
			if(target == A[mid]) return true;
			if(A[start]<A[mid]){
				if(target >= A[start] && target < A[mid]){
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}else if(A[start]>A[mid]){
				if(target > A[mid] && target <= A[end]){
					start = mid + 1;
				}else{
					end = mid - 1;
				}
			}else{
				start++;
			}
		}
		return false;  
    }

}
