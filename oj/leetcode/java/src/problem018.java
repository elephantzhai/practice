import java.util.ArrayList;
import java.util.List;


public class problem018 {

	public static void main(String[] args) {
		String digString = "23";
		List<String> resList = letterCombinations(digString);
		for(int i=0;i<resList.size();i++){
			System.out.println(resList.get(i));
		}
	}
	public static List<String> letterCombinations(String digits) {
        List<String> resList = new ArrayList<String>();
        List<String> tempList = new ArrayList<String>();
        if(digits.length() == 0){
        	resList.add("");
        	return resList;
        }
        for(int i=0;i<digits.length();i++){
        	String numString = getDefaultString(digits.charAt(i));
        	for(int j=0;j<numString.length();j++){
        		char ch = numString.charAt(j);
//        		System.out.println("ch: "+ch);
        		if(i==0){
        			tempList.add(ch+"");
//        			tempList.add("test ");
        		}else{
        			for(int k=0;k<resList.size();k++){
        				tempList.add(resList.get(k)+ch);
        			}
        		}
        	}
//        	for(int m=0;m<tempList.size();m++){
//    			System.out.println("temp res:"+tempList.get(m));
//    		}
        	resList = tempList;
        	tempList = new ArrayList<String>();
        }
        
        return resList;
    }
	
	public static String getDefaultString(char num){
		switch (num) {
		case '2':
			return "abc";
		case '3':
			return "def";
		case '4':
			return "ghi";
		case '5':
			return "jkl";
		case '6':
			return "mno";
		case '7':
			return "pqrs";
		case '8':
			return "tuv";
		case '9':
			return "wxyz";

		default:
			break;
		}
		return "";
	}

}
