import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class problem015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {-1,0,1,2,-1,-4};
		List<List<Integer>> res = threeSum(num);
		printList(res);
	}
	
	public static void printList(List<List<Integer>> res){
		for (int i = 0; i < res.size(); i++) {
			List<Integer> tempList = res.get(i);
			for (int j = 0; j < tempList.size(); j++) {
				System.out.print(tempList.get(j)+" ");
			}
			System.out.println();
		}
	}
	
	public static List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        Arrays.sort(num);
        int allLength = num.length;
        int target = 0;
        int i;
        int start,end,tempsum;
        List<Integer> tempList = null;
        for(i=0;i<allLength-2;i++){
        	if(i==0 || num[i]>num[i-1]){
        		target = -num[i];
        		start = i+1;end = allLength-1;
        		while(start<end){
        			tempsum = num[start]+num[end];
        			if(tempsum == target){
        				tempList = new ArrayList<Integer>();
        				tempList.add(num[i]);tempList.add(num[start]);tempList.add(num[end]);
        				resList.add(tempList);
        				start++;end--;
        				while (start<end && num[start-1]==num[start]){start++;} 
        				while (start<end && num[end]==num[end+1]){end--;} 
        			}else if (tempsum<target) {
        				start++;
        				while (start<end && num[start-1]==num[start]){start++;} 
					}else{
						end--;
						while (start<end && num[end]==num[end+1]){end--;} 
					}
        		}
        	}
        	
        	
        }
        
        
        
        return resList;
    }

}
