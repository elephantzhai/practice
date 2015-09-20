


public class problem098 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem098 p = new problem098();
		TreeNode root = p.genTree();
		boolean res = p.isValidBST(root);
		System.out.println("res:"+res);
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
	
	public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
	
	public boolean isValid(TreeNode root,long min,long max){
		if(root == null) return true;
		if(root.val>min && root.val<max && isValid(root.left, min, root.val) && isValid(root.right, root.val, max)){
			return true;
		}else{
			return false;
		}
	}

}
