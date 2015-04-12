import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class problem078 {

	public static void main(String[] args) {
		int[] s = {1,2,3};
		List<List<Integer>> res = subsets(s);
		for(int i = 0;i<res.size();i++){
			List<Integer> list = res.get(i);
			for(int j = 0;j<list.size();j++){
				System.out.print(list.get(j)+" ");
			}
			System.out.println("|");
		}
	}
	
	public static List<List<Integer>> subsets(int[] S) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(S);
        process(S, 0, S.length, new ArrayList<Integer>(), res);
        return res;
    }
	
	public static void process(int[] s,int start,int end,List<Integer> list,List<List<Integer>> res){
		if(start == end){
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			list2.addAll(list);
			res.add(list2);
			return;
		}
		
		list.add(s[start]);
		process(s, start+1, end, list, res);
		list.remove(list.size()-1);
		
		process(s, start+1, end, list, res);
	}

}
