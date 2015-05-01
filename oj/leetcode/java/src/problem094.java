import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class problem094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem094 p = new problem094();
		TreeNode root = p.genTree();
		List<Integer> res = p.inorderTraversal(root);
		System.out.println(res);
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public TreeNode genTree(){
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		t1.right = t2;
		t2.left = t3;
		return t1;
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
//        recursive(root, list);
        stack(root, list);
        return list;
    }
	
	public static void recursive(TreeNode node,List<Integer> list){
		if(node==null) return;
		recursive(node.left, list);
		list.add(node.val);
		recursive(node.right, list);
	}
	
	public static void stack(TreeNode root,List<Integer> list){
		if(root == null) return;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = root;
		while(node!=null || stack.size()>0){
			while(node!=null){
				stack.push(node);
				node = node.left;
			}
			node = stack.pop();
			list.add(node.val);
			node = node.right;
		}
	}

}
