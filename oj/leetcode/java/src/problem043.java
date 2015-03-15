
public class problem043 {

	public static void main(String[] args) {
		String num1 = "12345";
		String num2 = "67890";
		String resString = multiply(num1, num2);
		System.out.println("res:"+resString);
	}
	
	public static String multiply(String num1, String num2) {
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        int[] res = new int[(num1.length()+num2.length())];
        for(int i=0;i<num1.length();i++){
        	int a = num1.charAt(i)-'0';
        	for(int j = 0;j<num2.length();j++){
        		int b = num2.charAt(j) - '0';
        		res[i+j] += a*b;
        	}
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<res.length;i++){
        	int remainder = res[i]%10;
        	int up = res[i]/10;
        	sb.insert(0, remainder);
        	if(i<res.length-1){
        		res[i+1] += up;
        	}
        }
        while(sb.length()>0 && sb.charAt(0) == '0'){
        	sb.deleteCharAt(0);
        }
        return sb.length() == 0?"0":sb.toString();
    }

}
