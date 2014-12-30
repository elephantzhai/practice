import java.util.HashMap;


public class problem001 {
	//Two Sum
	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int target =9;
		int[] res = twoSum(numbers, target);
		System.out.println(""+res[0]+" "+res[1]);
	}
	
	public static  int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int length = numbers.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int num,tempNum;
        for(int i=1;i<=length;i++){
        	num = numbers[i-1];
        	tempNum = target - num;
        	if(map.containsKey(tempNum)){
        		res[0] = map.get(tempNum);
        		res[1] = i;
        		break;
        	}else{
        		map.put(num, i);
        	}
        			
        }
        return res;
    }

}
