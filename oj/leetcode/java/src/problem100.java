

public class problem100 {

	public static void main(String[] args) {
		problem100 p = new problem100();
		TreeNode root1 = p.genTree();
		TreeNode root2 = p.genTree();
		boolean isSame = p.isSameTree(root1, root2);
		System.out.println("issame:"+isSame);
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p== null && q == null) return true;
        if((p == null && q != null) || (p != null && q == null)) return false;
        if(p.val!=q.val) return false;
        return (isSameTree(p.left, q.left)&&isSameTree(p.right, q.right));
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
	

}
