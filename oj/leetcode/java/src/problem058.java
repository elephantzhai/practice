
public class problem058 {

	public static void main(String[] args) {
		String string = "Hello World";
		int res = lengthOfLastWord(string);
		System.out.println("res:"+res);
	}
	
	public static int lengthOfLastWord(String s) {
        int len = s.length();
        if(len==0){
        	return 0;
        }
        int lastPos = len-1;
        for(;lastPos>=0;lastPos--){
        	if(s.charAt(lastPos)!=' '){
        		break;
        	}
        }
        if(lastPos<0){
        	return 0;
        }
        int firstPos = lastPos;
        for(;firstPos>=0;firstPos--){
        	if(s.charAt(firstPos)== ' '){
        		break;
        	}
        }
        return lastPos - firstPos;
    }

}
