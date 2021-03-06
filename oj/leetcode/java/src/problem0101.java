


public class problem0101 {

	public static void main(String[] args) {
		problem0101 p = new problem0101();
		TreeNode root = p.genTree();
		boolean isMir = p.isSymmetric(root);
		System.out.println("isMir:"+isMir);
	}
	
	public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSameTree(root.left, root.right);
    }
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p== null && q == null) return true;
        if((p == null && q != null) || (p != null && q == null)) return false;
        if(p.val!=q.val) return false;
        return (isSameTree(p.left, q.right)&&isSameTree(p.left, q.right));
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
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(3);
		t1.right = t2;
		t2.left = t3;
		
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t2.left = t4;
		t2.right = t5;
		
		TreeNode t6 = new TreeNode(4);
		t3.left = null;
		t3.right = t6;
		
		
		return t1;
	}

}

