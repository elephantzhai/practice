import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;


public class problem028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystackString = "abcdefg";
		String needle = "def";
		int ret = strStr(haystackString, needle);
		System.out.println(ret);
	}
	
	public static int strStr(String haystack, String needle) {
        if (haystack== null || needle == null){
        	return -1;
        }
        if(haystack.length()<needle.length()){
        	return -1;
        }
        if(haystack.length()==0 || needle.length() ==0){
        	return 0;
        }
        
        int bash = 29;
        long tempBase = 1;
        long hashkey = 0;
        for(int i=0;i<needle.length();i++){
        	hashkey*=bash;
        	hashkey += needle.charAt(i);
        	if (i!=0){
        		tempBase*=bash;
        	}
        }
        long temphash = 0;int pos=-1;
        for(int i=0;i<needle.length()-1;i++){
        	temphash*=bash;
        	temphash += haystack.charAt(i);
        }
        System.out.println(hashkey+" "+temphash);
        int needleLen = needle.length();
        for(int i=needle.length()-1;i<haystack.length();i++){
        	temphash*=bash;
        	temphash += haystack.charAt(i);
        	if(hashkey == temphash){
        		pos = i-needle.length()+1;
        		break;
        	}else{
        		temphash = temphash - haystack.charAt(i-needleLen+1)*tempBase;
        	}
        }
        		
		
		
		return pos;
    }

}
