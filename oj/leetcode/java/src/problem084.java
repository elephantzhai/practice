import java.util.LinkedList;


public class problem084 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {2,1,5,6,2,3};
		int max = largestRectangleArea(height);
		System.out.println("res:"+max);
	}
	
	public static int largestRectangleArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int max = 0;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        for(int i = 0;i<height.length;i++){
        	while(!stack.isEmpty() && height[i]<=height[stack.peek()]){
        		int index = stack.pop();
        		int curArea = stack.isEmpty()?i*height[index]:(i-stack.peek()-1)*height[index];
        		max = Math.max(max, curArea);
        	}
        	stack.push(i);
        	System.out.print("i:"+i+" | ");
        	for(int j = stack.size()-1;j>=0;j--){
        		System.out.print(stack.get(j)+" ");
        	}
        	System.out.println();
        }
        while(!stack.isEmpty()){
        	int index = stack.pop();
        	int curArea = stack.isEmpty()?height.length*height[index]:(height.length-stack.peek()-1)*height[index];
    		max = Math.max(max, curArea);
        }
		return max;
    }

}
