
public class problem029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 108,divisor = 2;
		System.out.println(divide(dividend, divisor));
		

	}
	public static int divide(int dividend, int divisor) {
		if(divisor == 0){
			return Integer.MAX_VALUE;
		}
		boolean isNeg = (dividend^divisor)>>>31 == 1;
		int res = 0;
		if(dividend == Integer.MIN_VALUE){
			dividend += Math.abs(divisor);
			if(divisor == -1){
				return Integer.MAX_VALUE;
			}
			res++;
		}
		if(divisor == Integer.MIN_VALUE){
			return res;
		}
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		int digit = 0;
		while(divisor <= (dividend>>1))
		{
			divisor <<=1;
			digit++;
		}
		System.out.println(dividend+" "+divisor);
		while(digit>=0){
			if(dividend>=divisor){
				res+=1<<digit;
				dividend-=divisor;
			}
			divisor >>=1;
			digit--;
		}
		return isNeg?-res:res;		
    }

}
