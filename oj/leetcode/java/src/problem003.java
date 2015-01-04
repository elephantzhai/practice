
public class problem003 {

	public static void main(String[] args) {
//		String s = "abcabcbb";
		String s = "bbbbb";
		System.out.println(lengthOfLongestSubstring(s));

	}
	
	public static void printStr(String str,int start,int len){
		System.out.println(str.substring(start, start+len));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		int[] hash = null;
		int i,j,len=s.length();
		int maxlen=0,maxindex=0;
		
		for(i=0;i<len;i++){
			hash = new int[256];
			int chi = s.charAt(i);
			hash[chi] = 1;
			int chj;
			for(j=i+1;j<len;j++){
				chj = s.charAt(j);
				if(hash[chj]==0){
					hash[chj]=1;
				}else{
					if(j-i>maxlen){
						maxlen = j-i;
						maxindex = i;
					}
					break;
				}
			}
			if(j==len && (j-i>maxlen)){
				maxlen = j-i;
				maxindex = i;
			}
		}
//		printStr(s, maxindex, maxlen);
		
		return maxlen;
    }

}
