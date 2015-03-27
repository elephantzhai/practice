import java.util.ArrayList;


public class problem066 {

	public static void main(String[] args) {
		int[] digits = {1,9,9};
		int[] res = plusOne(digits);
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]);
		}
	}
	
	public static int[] plusOne(int[] digits) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		int flag = 1,tmp=0;
		for(int i = digits.length-1;i>=0;i--){
			tmp = flag+digits[i];
			flag = tmp / 10;
			res.add(tmp%10);
		}
		if(flag>0){
			res.add(flag);
		}
		int len = res.size();
		int[] finalRes = new int[len];
		
		for(int i = 0;i<len;i++){
			finalRes[len-1-i] = res.get(i);
		}
		return finalRes;
    }

}
