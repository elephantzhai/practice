import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class problem049 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"tea","and","ate","eat","den"};
		List<String> resList = anagrams(strs);
		for(int i=0;i<resList.size();i++){
			System.out.println(resList.get(i));
		}
	}
	
	public static List<String> anagrams(String[] strs) {
        ArrayList<String> reStrings = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0;i<strs.length;i++){
        	String s = strs[i];
        	char[] cs = s.toCharArray();
        	Arrays.sort(cs);
        	String s2 = String.valueOf(cs);
        	if (map.containsKey(s2)){
        		int pos = map.get(s2);
        		if(pos!=-1){
        			reStrings.add(strs[pos]);
        			map.put(s2, -1);
        		}
        		reStrings.add(s);
        	}else{
        		map.put(s2, i);
        	}
        	
        }
        return reStrings;
    }

}
