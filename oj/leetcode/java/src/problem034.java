
public class problem034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] A = {5,7,7,8,8,10};
//		int target = 8;
		int[] A = {2,2};
		int target = 3;
		
		int[] res = searchRange(A, target);
		System.out.println("result: "+res[0]+" "+res[1]);
	}
	public static int[] searchRange(int[] A, int target) {
		
		int[] res = {-1,-1};
		int n = A.length;
		int lower = 0;
		int upper = n;
		int mid=-1;
		
		
		while(lower<upper){
			mid = (lower+upper)/2;
			if(A[mid]<target){
				lower = mid+1;
			}else{
				upper = mid;
			}
//			System.out.println("lower:"+lower+" mid:"+mid+" upper:"+upper);
			
		}
		if(lower>= n || A[lower]!=target){
			return res;
		}
		res[0] = lower;
		
		upper = n;
//		System.out.println("lower:"+lower+" mid:"+mid+" upper:"+upper);
		while(lower	<upper){
			mid = (lower+upper)/2;
			if(A[mid]>target){
				upper = mid;
			}else{
				lower = mid+1;
			}
//			System.out.println("lower:"+lower+" mid:"+mid+" upper:"+upper);
		}
		res[1] = upper-1;
		
		
		
		return res;
    }

}
