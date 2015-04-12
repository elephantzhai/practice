


public class problem082 {

	public static void main(String[] args) {
		int[] A = {1,1,2,3,3};
		problem082 p = new problem082();
		ListNode headListNode = p.initListNode(A);
		ListNode resListNode = p.deleteDuplicates(headListNode);
		p.printListNode(resListNode);
	}
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode tmpHead = new ListNode(0);
		ListNode realHead = tmpHead;
		ListNode before = head;
		ListNode now = head.next;
		boolean isInSame = false;
		boolean isDiff = false;
		while(now != null){
			isDiff = before.val != now.val;
			if(isDiff){
				if(isInSame){
					
				}else{
					tmpHead.next = before;
					tmpHead = before;
				}
				isInSame = false;
			}else{
				isInSame = true;
			}
			before = now;
			now = now.next;
		}
		if(!isInSame){
			tmpHead.next = before;
			tmpHead = before;
		}
		tmpHead.next = null;
		
		return realHead.next;
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
