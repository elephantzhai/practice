public class problem088 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] All = new int[1000];
		int[] A = { 1, 3, 5 };
		int[] B = { 2, 4, 6 };
		for (int i = 0; i < A.length; i++) {
			All[i] = A[i];
		}
		merge(All, A.length, B, B.length);
		for (int i = 0; i < A.length + B.length; i++) {
			System.out.print(All[i] + " ");
		}
		System.out.println();

	}

	public static void merge(int A[], int m, int B[], int n) {
		int k = m + n - 1;
		int i = m - 1;
		int j = n - 1;
		
		for(;i>=0 && j>=0;k--){
			if(B[j]>=A[i]){
				A[k] = B[j];
				j--;
			}else{
				A[k] = A[i];
				i--;
			}
		}
		while(j>=0){
			A[k] = B[j];
			k--;
			j--;
		}
		

	}

}
