
public class problem067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "0";
		String b = "0";
		String res = addBinary(a, b);
		System.out.println("res:"+res);
				
	}
	
	public static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder(); 
        int carry = 0;
        int a1,b1,v;
        for(int i = a.length()-1,j = b.length()-1;i>=0||j>=0;i--,j--){
        	a1 = i<0?0:a.charAt(i)-'0';
        	b1 = j<0?0:b.charAt(j)-'0';
        	v = (a1+b1+carry)%2;
        	carry = (a1+b1+carry)/2;
        	sb.insert(0, v);
        }
        if(carry == 1){
        	sb.insert(0, carry);
        }
        return sb.toString();
    }

}
