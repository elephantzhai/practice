import java.util.ArrayList;
import java.util.List;


public class problem077 {

	public static void main(String[] args) {
		int n = 4,k=2;
		List<List<Integer>> resList = combine(n, k);
		for(int i=0;i< resList.size();i++){
			List<Integer> list = resList.get(i);
			for(int j=0;j<list.size();j++){
				System.out.print(list.get(j)+" ");
			}
			System.out.println();
		}
	}
	
	public static List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(n<1||k<1){
        	return res;
        }
        process(1, n, 0, new int[k], res);
        return res;
    }
	
	public static void process(int start,int end,int pos,int[] array,List<List<Integer>> res){
		if(pos == array.length){
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<array.length;i++){
				list.add(array[i]);
			}
			res.add(list);
			return;
		}
		for(int i= start;i<=end;i++){
			array[pos] = i;
			process(i+1, end, pos+1, array, res);
		}
	}

}
