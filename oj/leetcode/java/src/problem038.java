
public class problem038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 3;
		String ret = countAndSay(count);
		System.out.println(ret);
	}
	
	public static String countAndSay(int n) {
        String s = "1";
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int j = 1;
        while(j<n){
        	sb.setLength(0);
        	len = s.length();
        	count = 1;
        	for(int i = 1;i<len;i++){
        		if(s.charAt(i) == s.charAt(i-1)){
        			count++;
        		}else{
        			sb.append(count).append(s.charAt(i-1));
        			count = 1;
        		}
        	}
        	sb.append(count).append(s.charAt(len-1));
        	s = sb.toString();
//        	System.out.println("n:"+j+" s:"+s);
        	j++;
        }
        return s;
    }

}
