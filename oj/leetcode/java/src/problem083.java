
public class problem083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] A = {1,1,2};
		int[] A = {1,1,2,3,3};
		problem083 p = new problem083();
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

	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode realPos = head;
		ListNode nowPos = head.next;
		int beforeNum = head.val;
		
		while(nowPos!= null){
			System.out.println(nowPos.val+" "+realPos.val+" "+beforeNum);
			if(nowPos.val == beforeNum){
				
			}else{
				beforeNum = nowPos.val;
				realPos.next = nowPos;
				realPos = nowPos;
			}
			nowPos = nowPos.next;
		}
		realPos.next = null;
		
		return head;
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
