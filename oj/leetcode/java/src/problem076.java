import sun.print.resources.serviceui;


public class problem076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC";
		String t = "ABC";
		String minWinString = minWindow(s, t);
		System.out.println("res:"+minWinString);
	}
	public static String minWindow(String S, String T) {
        if(S.length()==0||S.length()<T.length()){
        	return "";
        }
        int[] appearance = new int[256];
        int[] excepted = new int[256];
        for(int i=0;i<T.length();i++){
        	char c = T.charAt(i);
        	excepted[c]++;
        }
        int widStart = 0,widEnd = 0;
        int minStart = 0,minEnd = 0;
        int minWidth = Integer.MAX_VALUE;
        int appeared = 0;
        for(widEnd = 0;widEnd<S.length();widEnd++){
        	char c = S.charAt(widEnd);
        	if(excepted[c]>0){
        		appearance[c]++;
        		if(appearance[c]<=excepted[c]){
        			appeared++;
        		}
        	}
        	if(appeared == T.length()){
//        		while(appearance[S.charAt(widStart)])
        		while(true){
        			char c2 = S.charAt(widStart);
        			if(appearance[c2]>excepted[c2] || excepted[c2] == 0){
        				widStart++;
        				appearance[c2] --;
        			}else{
        				break;
        			}
        		}
        		if(minWidth>(widEnd - widStart+1)){
        			minWidth = widEnd - widStart+1;
        			minStart = widStart;
        			minEnd = widEnd;
        		}
        		
        	}
        }
        if(minWidth == Integer.MAX_VALUE){
        	return "";
        }else{
        	return S.substring(minStart, minEnd+1);
        }
        
    }

}
