

public class problem092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem092 p = new problem092();
		int[] array = {1,2,3,4,5,6};
		ListNode head = p.initListNode(array);
		int m = 2,n = 5;
		ListNode res = p.reverseBetween(head, m, n);
		p.printListNode(res);
	}
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if(m == n) return head;
		ListNode tempHead = new ListNode(0);
		tempHead.next = head;
		ListNode pf,p1,p2;
		pf = tempHead;
		for(int i = 1;i<m;i++){
			pf = pf.next;
		}
		ListNode cur = pf.next,post = cur.next,temp;
		
		for(int i=m;i<n && post!=null;i++){
			temp = post.next;
			post.next = cur;
			cur = post;
			post = temp;
		}
		temp = pf.next;
		pf.next = cur;
		temp.next = post;
		
        return tempHead.next;
    }
	
	public ListNode initListNode(int[] nums) {

		ListNode head = new ListNode(nums[0]);
		ListNode temp = head;
		for (int i = 1; i < nums.length; i++) {
			temp.next = new ListNode(nums[i]);
			temp = temp.next;
		}
		return head;
	}

	public void printListNode(ListNode head) {
		ListNode temp = head;
		while (true) {
			if (temp == null) {
				break;
			}
			System.out.print(temp.val + "--> ");
			temp = temp.next;
		}
		System.out.println();
	}

}
