import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class problem039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2,3,6,7};
		int target = 7;
		List<List<Integer>> resList = combinationSum(candidates, target);
		for(int i=0;i<resList.size();i++){
			ArrayList<Integer> list= (ArrayList<Integer>) resList.get(i);
			System.out.print("i:"+i+" ");
			for(int j = 0;j<list.size();j++){
				System.out.print(list.get(j)+" ");
			}
			System.out.println();
		}
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> sols = new ArrayList<List<Integer>>();
        ArrayList<Integer> sol = new ArrayList<Integer>();
        Arrays.sort(candidates);
        findCombSum(candidates, 0, target, sol, sols);
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
				findCombSum(candidates, i, target-candidates[i], sol, sols);
				sol.remove(sol.size()-1);
			}
		}
	}

}
