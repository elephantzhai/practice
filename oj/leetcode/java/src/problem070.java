public class problem070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int length = 10;
		int length = 4;
		int res = climbStairs(length);
		System.out.println("res:"+res);
	}

	public static int climbStairs(int n) {
		if(n==1)return 1;
		if(n==2)return 2;
		int n1,n2,temp;
		n1 =1;
		n2 =2;
		
		for(int i =3;i<=n;i++){
			temp = n2;
			n2 += n1;
			n1 = temp;
		}
		return n2;
	}

}
