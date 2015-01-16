public class problem020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = "{(])}";
		System.out.println(isValid(testString));

	}

	public static boolean isValid(String s) {
		char[] stack = new char[s.length()];
		int pos = 0;
		boolean res = true;
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch == '('||ch=='['||ch=='{'){
				stack[pos] = ch;
				pos++;
			}else if(ch == ')'||ch == ']'||ch=='}'){
				if(pos <= 0){
					res = false;
				}else{
					char lastCh = stack[pos-1];
					switch (ch) {
					case ')':
						if (lastCh != '(')
							res = false;
						break;
					case ']':
						if (lastCh != '[')
							res = false;
						break;
					case '}':
						if (lastCh != '{')
							res = false;
						break;
					}
				}
				pos --;
				if (!res){
					break;
				}
			}
		}
		if(res && pos!=0){
			res = false;
		}
		
		return res;
	}

}
