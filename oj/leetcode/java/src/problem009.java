
public class problem009 {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(isPalindrome(num));
	}
	
	public static boolean isPalindrome(int x) {
		if(x == Integer.MAX_VALUE || x == Integer.MIN_VALUE){
			return false;
		}
		int tempX = 0;
        if(x>=0){
        	tempX = x;
        }else {
			return false;
		}
//        System.out.println(tempX);
        int len = 0;
        int res = tempX;
        int log1 = 1,log2=1;
        for(int i=0;res>=1;i++){
        	len++;
        	res = res/10;
        	if(i!=0){
        		log1*=10;
        	}
        }
//        System.out.println(len+" "+log1);
        boolean isPalindrome = true;
        res = tempX;
        if(len>1){
        	for(int i=0;i<len/2;i++){
        		int res1 = (res/log1)%10;
        		int res2 = (res/log2)%10;
//        		System.out.println(i+" "+res1+" "+res2);
        		if(res1!=res2){
        			isPalindrome = false;
        			break;
        		}
        		log1 /= 10;
        		log2 *= 10;
        	}
        	
        }
		
		return isPalindrome;
    }

}
