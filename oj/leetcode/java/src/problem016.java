import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class problem016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {-1,2,1,-4};
//		int[] num = {-3,-2,-5,3,-4};
//		int[] num = {0,2,1,-3};
//		int target = 1;
		int target = -1;
		System.out.println(threeSumClosest(num, target));
	}
	
	public static int threeSumClosest(int[] num, int target) {
	        Arrays.sort(num);
	        int allLength = num.length;
	        if(allLength<3){
	        	return 0;
	        }
	        
	        
	        int colsedTarget = num[0]+num[1]+num[2];
	        int colsedDelta = Math.abs(colsedTarget - target);
	        int tempTarget = 0;
	        int i;
	        int start,end,delta;
	        boolean isfound = false;
//	        for(i=0;i<allLength;i++){
//	        	System.out.print(num[i]+" ");
//	        }
//	        System.out.println();
//	        System.out.println(target);
	        for(i=0;i<allLength-2 && !isfound;i++){
	        	if(i==0 || num[i]>num[i-1]){
//	        		tempTarget = target - num[i];
	        		start = i+1;end = allLength-1;
	        		while(start<end){
	        			delta = target -(num[start]+num[end]+num[i]);
//	        			System.out.println("tempTarget:"+tempTarget+" delta:"+delta+" i:"+i+" s:"+start+" e:"+end);
	        			if(colsedDelta>Math.abs(delta)){
//	        				System.out.println("find closedDelta:"+colsedDelta);
	        				colsedDelta = Math.abs(delta);
	        				colsedTarget = target - delta;
	        			}
	        			
	        			
	        			if(delta == 0){
	        				isfound = true;
	        				break;
	        			}else if (delta>0) {
	        				start++;
	        				while (start<end && num[start-1]==num[start]){start++;} 
						}else{
							end--;
							while (start<end && num[end]==num[end+1]){end--;} 
						}
	        		}
	        	}
	        	
	        	
	        }
	        
        return colsedTarget;
    }

}
