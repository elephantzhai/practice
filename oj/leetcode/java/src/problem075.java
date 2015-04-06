
public class problem075 {

	public static void main(String[] args) {
//		int[] A = {1,0,1,2,1,0,2};
		int[] A = {0,0};
		sortColors(A);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
	}
	public static void sortColors(int[] A) {
		//red 0,white 1,blue 2
        int redPos=0,bluePos = A.length-1;
        int i=0;
        while(i<bluePos+1){
        	switch (A[i]) {
			case 0:
				swap(A,i,redPos);
				redPos++;
				i++;
				break;
			case 2:
				swap(A, i, bluePos);
				bluePos--;
				break;
			case 1:
				i++;
				break;

			default:
				break;
			}
        }
    }
	
	public static void swap(int[] A,int pos1,int pos2){
		int temp = A[pos1];
		A[pos1] = A[pos2];
		A[pos2] = temp;
	}

}
