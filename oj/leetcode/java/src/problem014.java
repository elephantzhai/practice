
public class problem014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"123","1234","12"};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
		int strsLen = strs.length;
		if(strsLen == 0){
			return "";
		}
		int minLen = strs[0].length();
		int i,j;
		for(i=1;i<strsLen;i++){
			if(strs[i].length() < minLen){
				minLen = strs[i].length();
			}
		}
		
		int pos = 0;
		char s = ' ';
		boolean isBreak = false;
		for(i=0;i<minLen;i++){
			s = strs[0].charAt(i);
			for(j=1;j<strsLen;j++){
				if(strs[j].charAt(i)!=s){
					isBreak = true;
					break;
				}
			}
			if(isBreak){
				break;
			}
			pos++;
		}
		String res = strs[0].substring(0, pos);

        return res;
    }

}
