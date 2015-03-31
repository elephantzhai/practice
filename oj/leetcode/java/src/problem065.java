

public class problem065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String string = " 0.1";
//		boolean res = isNumber(string);
//		System.out.println("res:"+res);
		
		String[] strings = {"0"," 0.1","abc","1 a","2e10","3.","1  ","-1.","6e6.5"," 005047e+6"};
		for(int i=0;i<strings.length;i++){
			boolean res = isNumber(strings[i]);
			System.out.println("String:"+strings[i]+" res:"+res);
		}
	}
	
	public static boolean isNumber(String s) {
		if(s.isEmpty()){
			return false;
		}
		StringBuilder sb = new StringBuilder(s);
		int len = s.length();
		int tempLen = len;
		while(tempLen>0 && sb.charAt(0) == ' ' ){
			sb.deleteCharAt(0);
			tempLen--;
		}
		if(tempLen == 0){
			return false;
		}
		System.out.println("last:"+sb.toString()+"|"+tempLen);
		while(tempLen>0 && sb.charAt(tempLen-1) == ' '){
			sb.deleteCharAt(tempLen-1);
			tempLen --;
		}
		if(tempLen == 0){
			return false;
		}
		if(sb.charAt(0) == '-'||sb.charAt(0) == '+'){
			sb.deleteCharAt(0);
			tempLen --;
		}
		String purityStr = sb.toString();
		System.out.println("purityStr:"+purityStr+"|end");
		len = purityStr.length();
		boolean isRadix = false;
		boolean isRadixBefore = false;
		boolean isRadixAfter = false;
		boolean isE = false;
		boolean isEBefore = false;
		boolean isEAfter = false;
		boolean isPos = false;
		boolean isMinus = false;
		
		for(int i = 0;i<len;i++){
			char c = purityStr.charAt(i);
			if(c>='0' && c<='9'){
				System.out.println("num");
				if(isE){
					isEAfter = true;
				}else{
					isEBefore = true;
				}
				if(isRadix){
					isRadixAfter = true;
				}else{
					isRadixBefore = true;
				}
				
			}else if(c>='a' && c<= 'z'){
				System.out.println("char");
				if(c!='e'){
					return false;
				}else{
					if(isE){
						return false;
					}else{
						isE = true;
					}
					if(!isEBefore){
						return false;
					}
				}
			}else if(c == '.'){
				System.out.println("point");
				if(isRadix){
					return false;
				}else{
					isRadix = true;
					if(isE){
						return false;
					}
				}
			}else if(c == '-'){
				if(isE){
					if(isPos || isMinus){
						return false;
					}
					isMinus = true;
				}else{
					return false;
				}
			}else if(c == '+'){
				if(isE){
					if(isPos || isMinus){
						return false;
					}
					isPos = true;
				}else{
					return false;
				}
			}
			else{
				System.out.println("default");
				return false;
			}
		}
		if(isE){
			if(!isEAfter){
				return false;
			}
		}
		if(isRadix){
			if(!isRadixAfter && !isRadixBefore){
				return false;
			}
		}
        return true;
	}
	
	public static boolean isLegalChar(char c){
		return false;
	}

}
