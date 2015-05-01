import java.util.ArrayList;
import java.util.List;


public class problem093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ipStr = "25525511135";
		List<String> res = restoreIpAddresses(ipStr);
		System.out.println(res);
	}
	
	public static List<String> restoreIpAddresses(String s) {
        ArrayList<String> res = new ArrayList<String>();
        parse(s, 0, 0, "",res);
        return res;
        
    }
	
	public static void parse(String s,int startPos,int partNum,String resultIp,List<String> res){
		if(s.length() - startPos>(4-partNum)*3)
			return;
		if(s.length() - startPos<(4-partNum))
			return;
		if(startPos == s.length() && partNum == 4){
			res.add(resultIp);
			return;
		}
		int num = 0;
		for(int i = startPos;i<startPos+3&&i<s.length();i++){
			num = num*10+(s.charAt(i)-'0');
			if(num<=255){
				String tmp = partNum == 0?(num+""):("."+num);
				
				parse(s, i+1, partNum+1, resultIp+tmp, res);
			}
			if(num == 0){
				break;
			}
		}
		
	}

}
