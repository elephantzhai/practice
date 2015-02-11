import java.util.Stack;


public class problem032 {

	public static void main(String[] args) {
		String srcString = ")()())";
		System.out.println(longestValidParentheses(srcString));

	}
	public static int longestValidParentheses(String s) {
		int start = -1;
		int maxLen = 0;
		Stack stack = new Stack();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='('){
				stack.add(i);
			}else{
				if(!stack.isEmpty()){
					stack.pop();
					if(stack.isEmpty()){
						maxLen = Math.max(i-start, maxLen);
					}else{
						maxLen = Math.max(i-(int)(stack.peek()), maxLen);
					}
				}else{
					start = i;
				}
			}
		}
		
		return maxLen;
    }

}
