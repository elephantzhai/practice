import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class problem046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3};
		ArrayList<List<Integer>> coList = (ArrayList<List<Integer>>) permute(num);
		for(int i = 0;i<coList.size();i++){
        	System.out.print("line:");
        	LinkedList<Integer> line = (LinkedList<Integer>) coList.get(i);
        	for(int j = 0;j<line.size();j++){
        		System.out.print(line.get(j)+" ");
        	}
        	System.out.println();
        }
	}
	
	public static List<List<Integer>> permute(int[] num) {
        ArrayList<List<Integer>> coList = new ArrayList<List<Integer>>();
        LinkedList<Integer> solution = new LinkedList<Integer>();
        boolean[] visited = new boolean[num.length];
        for(int i=0;i<visited.length;i++){
        	visited[i] = false;
        }
        process(coList, solution, num, visited, 0);
        
        return coList;
    }
	
	public static void process(List<List<Integer>> col,LinkedList<Integer> solution,int[] num,boolean[] visited,int step){
		if(step == num.length){
			col.add((List<Integer>) solution.clone());
		}
		for(int i= 0;i<num.length;i++){
			if(!visited[i]){
				visited[i] = true;
				solution.add(num[i]);
				process(col, solution, num, visited, step+1);
				solution.removeLast();
				visited[i] = false;
			}
		}
	}

}
