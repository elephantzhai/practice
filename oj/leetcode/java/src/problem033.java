
public class problem033 {

	public static void main(String[] args) {
		int[] num = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(search(num, target));
	}
	
	public static int search(int[] A, int target) {
		int l = 0,r = A.length-1;
		int m = -1;
		while(l<=r){
			m = (l+r)/2;
			if(A[m] == target) return m;
			if(A[m] >= A[l]){
				if(A[l] <= target && target<A[m]){
					r = m-1;
				}else{
					l = m+1;
				}
			}else{
				if(A[m]<target && target<A[r]){
					l = m+1;
				}else{
					r = m-1;
				}
			}
		}
		
        return -1;
    }

}
