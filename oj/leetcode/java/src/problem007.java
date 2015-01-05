
public class problem007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = -123;
		int a = 1000000003;
//		int a = 321;
		System.out.println(reverse(a));
	}
	
	public static int reverse(int x) {
		int isPos = x>=0?1:-1;
		int tempX;
		tempX = x*isPos;
		int len = 0;
		int j = tempX;
		int[] num = new int[10];
		while(j>=1){
			num[len] = j%10;
			j/=10;
			len++;
		}
		int res = 0;
		for(int i=0;i<len;i++){
			res = res*10+num[i];
		}
//		System.out.println(res);
		boolean isOver = false;
		j=res;
		for(int i=0;i<len;i++){
			if((j%10)!=num[len-i-1]){
//				System.out.println(j%10+" "+num[len-i-1]);
				isOver = true;
				break;
			}
			j /=10;
		}
		if(isOver){
			return 0;
		}else {
			return res*isPos;
		}
		
    }

}
