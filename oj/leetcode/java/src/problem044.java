import sun.nio.cs.FastCharsetProvider;


public class problem044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "ab";
//		String p = "?*";
//		String s = "aab";
//		String p = "a*a*b";
		
//		String s = "aa";
//		String p = "a";
		
//		String s = "abefcdgiescdfimde";
//		String p = "ab*cd?i*de";
		
//		String s = "aababaababababbbbabb";
//		String p = "baaaaa*";
		
		String s = "aa";
		String p = "*";
		
//		String s = "ab";
//		String p = "*a";
				
				

		
		boolean res = isMatch(s, p);
		System.out.println("res:"+res);
	}
	public static boolean isMatch(String s, String p) {
        boolean isStar = false;
        int sPos = 0,pPos = 0;
        s = s+"\0";p = p+"\0";
//        int sLen = s.length(),pLen = p.length();
        int backSPos = 0,backPPos = 0;
        
        char c ='0';
        for(;s.charAt(sPos)!= '\0';sPos++,pPos++){
        	c = s.charAt(sPos);
        	
        	switch (c) {
			case '?':
				break;
			case '*':
				isStar = true;
				backSPos = sPos;backPPos = pPos;
				while(p.charAt(backPPos) == '*')
					backPPos++;
				if(p.charAt(backPPos) == '\0'){
					return true;
				}
				sPos = backSPos-1;
				pPos = backPPos-1;
				break;				
			default:
//				System.out.println("default sPos:"+sPos+" pPos:"+pPos);
				if(s.charAt(sPos) != p.charAt(pPos)){
					System.out.println("error");
					if(!isStar){
						return false;
					}
					backSPos++;
					sPos = backSPos - 1;
					pPos = backPPos - 1;
				}
				
			}
//        	System.out.println("sPos:"+sPos+" pPos:"+pPos+" ismatch:");
        }
        while(p.charAt(pPos) == '*')
        	pPos++;
//        System.out.println("end sPos:"+sPos+" pPos:"+pPos);
        return p.charAt(pPos) == '\0';
        
        
//        return true;
        
        
    }

}
