
public class problem021 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		problem021 p = new problem021();
		int[] l1 = {1,2,6};
		int[] l2 = {3,4,5};
		ListNode res = p.mergeTwoLists(p.initListNode(l1),p.initListNode(l2));
		p.printListNode(res);
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		System.out.println("mergeTwoLists");
		if(l1 == null){
			System.out.println("l1 null");
			return l2;
		}
		if(l2 == null){
			System.out.println("l2 null");
			return l1;
		}
		ListNode head = new ListNode(0);
		ListNode temp = head;
		while(l1!=null && l2 != null){
			System.out.println("process l1:"+l1.val+" l2:"+l2.val);
			if(l1.val<=l2.val){
				temp.next = l1;
				l1 = l1.next;
			}else{
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}
		if(l1 == null){
			temp.next = l2;
		}else{
			temp.next = l1;
		}
		
		return head.next;
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
