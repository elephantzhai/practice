import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class problem040 {

	public static void main(String[] args) {
		int[] num = {10,1,2,7,6,1,5};
		int target = 8;
		List<List<Integer>> resList = combinationSum2(num, target);
		for(int i=0;i<resList.size();i++){
			ArrayList<Integer> list= (ArrayList<Integer>) resList.get(i);
			System.out.print("i:"+i+" ");
			for(int j = 0;j<list.size();j++){
				System.out.print(list.get(j)+" ");
			}
			System.out.println();
		}
	}
	
	public static List<List<Integer>> combinationSum2(int[] num, int target) {
		List<List<Integer>> sols = new ArrayList<List<Integer>>();
        ArrayList<Integer> sol = new ArrayList<Integer>();
        Arrays.sort(num);
        findCombSum(num, 0, target, sol, sols);
        return sols;
    }
	public static void findCombSum(int[] candidates,int start,int target,ArrayList<Integer> sol,List<List<Integer>> sols){
		if(target == 0){
			sols.add((ArrayList<Integer>)(sol.clone()));
			return;
		}
		for(int i = start;i<candidates.length;i++){
			if(i>start && candidates[i]==candidates[i-1]) continue;
			if(candidates[i]<=target){
				sol.add(candidates[i]);
				findCombSum(candidates, i+1, target-candidates[i], sol, sols);
				sol.remove(sol.size()-1);
			}
		}
	}

}
