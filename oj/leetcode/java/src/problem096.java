public class problem096 {
	public static void main(String[] args) {
		int nodeNum = 3;
		int res = numTrees(nodeNum);
		System.out.println(res);
	}

	public static int numTrees(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		int[] list = new int[n+1];
		list[0] = 1;
		list[1] = 1;
		for(int i = 2;i<=n;i++){
			int num = 0;
			for(int j = 0;j<i;j++){
				num += list[j]*list[i-1-j];
			}
			list[i] = num;
		}
		return list[n];
	}
}
