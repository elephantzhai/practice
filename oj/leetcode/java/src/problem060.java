

public class problem060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int k = 4;
		String resString = getPermutation(n, k);
		System.out.println("res:"+resString);
	}
	
	public static String getPermutation(int n, int k) {
        int p = 1;
        int[] list= new int[n];
        for(int i=1;i<=n;i++){
        	list[i-1] = i;
        	p *= i;
        }

        int tempK = k-1;
        int choose = 0;
        StringBuilder sb = new StringBuilder(); 
        for(int i=0;i<n;i++){
        	p /= (n-i);
//        	list[i] = tempK/p;
        	choose = tempK/p;
        	sb.append(list[choose]);
        	tempK = tempK%p;
        	for(int j = choose;j<n-i-1;j++){
        		list[j] = list[j+1];
        	}
        }
//        for(int i=0;i<n;i++){
//        	System.out.print(list[i]+" ");
//        }
//        System.out.println();
        return sb.toString();
    }

}
