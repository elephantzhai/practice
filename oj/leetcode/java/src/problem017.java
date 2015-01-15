import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;


public class problem017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num = {1,0,-1,0 ,-2, 2};
//		int target = 0;
		
		int[] num = {-1,0,1,2,-1,-4};
		int target = -1;
		List<List<Integer>> res= fourSum(num,target);
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
	public static List<List<Integer>> fourSum(int[] num,int target) {
		List<List<Integer>> resList = new ArrayList<List<Integer>>();
        Arrays.sort(num);
        
        int allLength = num.length,tempListLength=0;
        int tempTarget = 0;
        int i,j,k;
        int start,end,tempsum;
        HashMap<Integer, ArrayList<ArrayList<Integer>>> hashMap = new HashMap<Integer, ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> tempArrayPair = null;
        ArrayList<ArrayList<Integer>> tempArrayList = null;
        for(i=0;i<allLength-1;i++){
        	for(j=i+1;j<allLength;j++){
        		tempsum = num[i]+num[j];
        		tempArrayPair = new ArrayList<Integer>();
    			tempArrayPair.add(i);
    			tempArrayPair.add(j);
        		if(hashMap.containsKey(tempsum)){
        			hashMap.get(tempsum).add(tempArrayPair);
        		}else{
        			tempArrayList = new ArrayList<ArrayList<Integer>>();
        			tempArrayList.add(tempArrayPair);
        			hashMap.put(tempsum,tempArrayList);
        		}
        	}
        }
        
//        for(i=0;i<allLength;i++){
//        	System.out.print(num[i]+" ");
//        }
//        System.out.println();
//        System.out.println(target);
        
        List<Integer> tempList = null;
        boolean isFirstePush = false;
        int first,lastFirst=0;
        for(i=0;i<allLength - 3;i++){
        	if(i!=0 && num[i-1]==num[i]) continue;
        	for(j=i+1;j<allLength-2;j++){
        		if(j!=i+1 && num[j-1]==num[j]) continue;
//        		System.out.println(i+" "+j);
        		tempTarget = target -num[i] - num[j];
        		if(hashMap.containsKey(tempTarget)){
        			tempArrayList = hashMap.get(tempTarget);
        			tempListLength = tempArrayList.size();
        			isFirstePush = true;
        			for(k=0;k<tempListLength;k++){
        				tempArrayPair = tempArrayList.get(k);
        				first = tempArrayPair.get(0);
        				if(first<=j)continue;
        				if(isFirstePush || num[lastFirst]!=num[first]){
//        					second = tempArrayPair.get(1);
        					tempList = new ArrayList<Integer>();
        					tempList.add(num[i]);
        					tempList.add(num[j]);
        					tempList.add(num[first]);
        					tempList.add(num[tempArrayPair.get(1)]);
        					resList.add(tempList);
        					isFirstePush = false;
        					lastFirst =first;
        				}
        			}
        			
        		}
        		
        	}
        }
        return resList;
    }

}
