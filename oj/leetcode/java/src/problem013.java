import java.util.HashMap;


public class problem013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MCDXXXVII";
		System.out.println(romanToInt(s));

	}
	
	public static int romanToInt(String s) {
		HashMap<Character, Integer> map = getMap();
		int len = s.length();
		if(len<=0){
			return 0;
		}
		
		int sum = 0;
		int nowNum=0,nextNum=0;
		for(int i=0;i<len;i++){
			nowNum = map.get(s.charAt(i));
			if(i == len -1){
				sum += nowNum;
			}else{
				nextNum = map.get(s.charAt(i+1));
				if(nextNum>nowNum){
					sum += (nextNum - nowNum);
					i++;
				}else{
					sum += nowNum;
				}
			}
			
		}
		return sum;
    }
	
	public static HashMap<Character, Integer> getMap(){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		return map;
	}

}
