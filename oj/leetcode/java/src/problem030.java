import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class problem030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "a";
		String[] L = {"a"};
		List<Integer> res = findSubstring(S, L);
		System.out.println(res.size());
		for(int i:res){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static List<Integer> findSubstring(String S, String[] L) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int wordLen = L[0].length();
        int numOfWord = L.length;
        int length = wordLen*numOfWord;
        if(S.length()<length){
        	return list;
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String word:L ){
        	if(map.containsKey(word)){
        		map.put(word, map.get(word)+1);
        	}else{
        		map.put(word, 1);
        	}
        }
        
        for(int i=0;i<=S.length()-length;i++){
        	String subString = S.substring(i,i+length);
        	HashMap<String, Integer> map2 = (HashMap<String, Integer>) map.clone();
        	while(true){
        		String word = subString.substring(0,wordLen);
        		if(map2.containsKey(word)){
        			int num = map2.get(word)-1;
        			if(num <0){
        				break;
        			}else{
        				map2.put(word, num);
        				subString = subString.substring(wordLen);
        				if(subString.isEmpty()){
        					list.add(i);
        					break;
        				}
        			}
        		}else{
        			break;
        		}
        	}
        }
        
        return list;
       
    }

}
