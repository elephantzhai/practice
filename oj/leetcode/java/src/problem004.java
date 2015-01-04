
public class problem004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {1,2};
        int b[] = {1,2};
		System.out.println(findMedianSortedArrays(a, b));

	}
	
	public static double findMedianSortedArrays(int A[], int B[]) {
        int size = A.length+B.length;
        int midIndex = (size+1)/2;
        boolean isOdd = (size%2==1);
        if(isOdd){
        	return findK(A, B, midIndex);
        }else{
        	return (findK(A, B, midIndex)+findK(A, B, midIndex+1))/2.0;
        }
        
        
    }
	
	public static int findK(int A[], int B[],int k) {
		int passA=0,passB=0,ALEN = A.length,BLEN = B.length;
		int tempK = k;
		int alen,blen;
		int index1,index2,resA,resB;
		while(true){
			alen = ALEN-passA;blen = BLEN - passB;
        	// System.out.println("alen:"+alen+" passA:"+passA+" blen:"+blen+" passB:"+" tempK:"+tempK);
			if(alen == 0){
				return B[passB+tempK-1];
			}else if(blen == 0){
				return A[passA+tempK-1];
			}
			if (tempK == 1){
				return A[passA]<B[passB]?A[passA]:B[passB];
			}
			
			index1 = (int) (alen*1.0/(alen+blen)*(k-1));
            if(index1>=alen){
                index1 = alen-1;
            }
			index2 = tempK-index1-2;
            if(index2<0){
                index2 = 0;
                index1 = tempK-2;
            }
			
			resA = A[passA+index1];
			resB = B[passB+index2];
			if (resA == resB){
				return resA;
			}else if(resA<resB){
				passA+=index1+1; tempK -= index1+1;
			}else{
				passB+=index2+1;tempK -= index2+1;
			}
			
		}
        
    }
	
	

}
