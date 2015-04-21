import java.util.LinkedList;


public class problem085 {

	public static void main(String[] args) {
		char[][] matrix = {
				{'0','0','1','0'},
				{'0','0','0','1'},
				{'0','1','1','1'},
				{'0','0','1','1'}
		};
		int res = maximalRectangle(matrix);
		System.out.println("res:"+res);
	}
	
	public static int maximalRectangle(char[][] matrix) {
		int rowLen = matrix.length;
		if(rowLen == 0) return 0;
		int colLen = matrix[0].length;
		if(colLen == 0) return 0;
		int[] heights = new int[colLen];
		int maxArea = 0;
		for(int i = 0;i<rowLen;i++){
			for(int j=0;j<colLen;j++){
				if(matrix[i][j] == '0'){
					heights[j] = 0;
				}else{
					heights[j] += 1;
				}
			}
			int lineMax = largestRectangleArea(heights);
			if(lineMax>maxArea){
				maxArea = lineMax;
			}
			
		}
        return maxArea;
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
        }
        while(!stack.isEmpty()){
        	int index = stack.pop();
        	int curArea = stack.isEmpty()?height.length*height[index]:(height.length-stack.peek()-1)*height[index];
    		max = Math.max(max, curArea);
        }
		return max;
    }

}
