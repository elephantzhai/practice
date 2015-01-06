
public class problem008 {

	public static void main(String[] args) {
		String numString = " b11228552307";
		System.out.println(atoi(numString));
	}
	
	public static int atoi(String str) {
		char[] num = str.toCharArray();
		int len = str.length();
		char ch;
		int i=0,delta=0;
		int isPos = 1;
		boolean isBegin = false;
		int startpos = 0,endpos=0;
		for(i=0;i<len;i++){
			ch = num[i];
			if(ch == ' '){
				continue;
			}
			if(ch == '-'){
				isPos = -1;
				isBegin = true;
				i++;
				if(i>=len){
					isBegin = false;
				}
				startpos = i;
				break;
			}
			if(ch == '+'){
				isBegin = true;
				i++;
				if(i>=len){
					isBegin = false;
				}
				startpos = i;
				break;
			}
			delta = ch-'0';
			if(delta<=9 && delta>=0 ){
				isBegin = true;
				startpos = i;
				break;
			}else{
				break;
			}
			
		}
		int res = 0;
		if(!isBegin){
			return 0;
		}else{
			endpos = startpos;
			for(;i<len;i++){
				ch = num[i];
				delta = ch - '0';
				if(delta<=9 && delta>=0 ){
					res = res*10+delta;
					endpos = i;
				}else{
					if(startpos == i){
						return 0;
					}
					break;
				}
			}
//			res = res*isPos;
		}
		int tesRes = res;
		for(i=endpos;i>=startpos;i--){
			if(tesRes%10!=(num[i]-'0')){
				if(isPos == 1){
					return Integer.MAX_VALUE;
				}else {
					return Integer.MIN_VALUE;
				}
			}else{
				tesRes /= 10;
			}
		}
		
		return res*isPos;
		
		
    }

}
