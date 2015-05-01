import java.util.ArrayList;
import java.util.List;



public class problem095 {

	public static void main(String[] args) {
		problem095 p = new problem095();
		int n = 3;
		List<TreeNode> list = p.generateTrees(n);
		System.out.println("size:"+list.size());
	}
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public  List<TreeNode> generateTrees(int n) {
		if(n==0) return gen(1, 0);
		return gen(1, n);
    }
	
	public  List<TreeNode> gen(int start,int end){
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		if(start>end){
			list.add(null);
			return list;
		}
		
		for(int i = start;i<=end;i++){
			List<TreeNode> l = gen(start, i-1);
			List<TreeNode> r = gen(i+1, end);
			for(int j =0;j < l.size();j++){
				for(int k = 0;k<r.size();k++){
					TreeNode root = new TreeNode(i);
					root.left = l.get(j);
					root.right = r.get(k);
					list.add(root);
				}
			}
		}
		
		return list;
		
	}

}
