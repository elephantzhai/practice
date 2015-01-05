public class problem005 {

	public static void main(String[] args) {
		String str = "1aabbaabda";
		System.out.println(longestPalindrome(str));
	}
	
	public static String longestPalindrome(String s) {
		int len = s.length();
		char[] str = new char[len*2+2+1];
		str[0] = '$';
		str[1] = '#';
		int i=0;
		for(i=0;i<len;i++){
			str[i*2+2] = s.charAt(i);
			str[i*2+3] = '#';
		}
		int[] p = new int[len*2+2+1];
		int id=0,mx=0,maxid=0;
		len = len*2+2;
		for(i=1;i<len;i++){
			if(mx>i){
				p[i] = Math.min(p[2*id-i], mx-i);
			}else{
				p[i]=1;
			}
			for(;str[i-p[i]]==str[i+p[i]];p[i]++);
			if(i+p[i]>mx){
				id = i;
				mx = i+p[i];
			}
			if(p[i]>p[maxid]){
				maxid = i;
			}
		}
		
//		for(i=0;i<len;i++){
//			System.out.print(str[i]);
//		}
//		System.out.println();
//		for(i=0;i<len;i++){
//			System.out.print(p[i]);
//		}
//		System.out.println("\nid:"+id+" mx:"+mx+" maxid:"+maxid+" range:"+p[maxid]);
//		int start=0,end=0;
		int range=p[maxid];
//		if(maxid%2==0){
//			start = (maxid-range)/2;
//			end = (maxid+range)/2-1;
//		}else{
//			start = (maxid-range)/2;
//			end = (maxid+range)/2-1;
//		}
//		return s.substring(start, end);
		return s.substring((maxid-range)/2, (maxid+range)/2-1);
		
		
		
//        return s;
    }

}
