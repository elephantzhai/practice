

public class problem091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1010";
		int res = numDecodings(s);
		System.out.println("res:"+res);
	}
	public static int numDecodings(String s) {
//        if(s.length()<=1) return s.length();
		if(s.length() == 0) return 0;
		if(s.length() == 1){
			if(s.equals("0"))
				return 0;
			else {
				return 1;
			}
		}
        int len = s.length();
        int[] nums = new int[len];
        for(int i = 0;i<s.length();i++){
        	nums[i] = s.charAt(i)-'0';
        }
        
        int step1 = 1;
        if(nums[0] == 0) return 0;
        if(!isCheck(nums, 0))return 0;
        int step2 = 1;
        
        int pos = 2;
        if(nums[1] != 0 && isNext(nums, 0)){
        	step2++;
        }
        int temp = step2;
        
        for(;pos<len;pos++){
        	temp = step2;
        	if(!isCheck(nums,pos-1)){
        		return 0;
        	}
        	else if(nums[pos] == 0){
        		System.out.println("1 pos:"+pos+" num:"+nums[pos]+" step1:"+step1+" step2:"+step2);
        		step2 = step1;
        	}else if(isNext(nums, pos-1)){
        		System.out.println("2 pos:"+pos+" num:"+nums[pos]+" step1:"+step1+" step2:"+step2);
        		step2 = step2+step1;
        		step1 = temp;
        	}else{
        		System.out.println("3 pos:"+pos+" num:"+nums[pos]+" step1:"+step1+" step2:"+step2);
        		step1 = step2;
        	}
        }
        return step2;
        
    }
	
	private static boolean isCheck(int[] nums, int pos) {
		if(pos>=nums.length) return false;
		if(pos == nums.length-1) return true;
//		if(nums[pos] == 0 && nums[pos+1] == 0) return false;
		if(nums[pos+1] == 0){
			if(nums[pos]>2 || nums[pos] ==0) return false;
		}
		return true;
	}
	public static boolean isNext(int[] nums,int pos){
		if(pos>=nums.length-1) return false;
		int next = nums[pos]*10+nums[pos+1];
		if(next>=10 && next<=26) return true;
		return false;
	}

}
