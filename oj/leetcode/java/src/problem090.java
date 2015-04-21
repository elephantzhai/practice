import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class problem090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {2,2,2,2};
		List<List<Integer>> res = subsetsWithDup(s);
		for(int i = 0;i<res.size();i++){
			List<Integer> list = res.get(i);
			for(int j = 0;j<list.size();j++){
				System.out.print(list.get(j)+" ");
			}
			System.out.println();
		}
	}
	
	public static List<List<Integer>> subsetsWithDup(int[] num) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        res.add((ArrayList<Integer>)(list.clone()));
        if(num == null || num.length == 0) return res;
        Arrays.sort(num);
        gen(0, num, list, res);
        
        return res;
    }
	
	public static void gen(int step,int[] num, ArrayList<Integer> list,ArrayList<List<Integer>> res){
		for(int i = step;i<num.length;i++){
			list.add(num[i]);
			res.add((List<Integer>) list.clone());
			if(i<num.length-1){
				gen(i+1,num, list, res);
			}
			list.remove(list.size()-1);
			while(i<num.length-1 && num[i] == num[i+1]){
				i++;
			}
		}
	}

}
