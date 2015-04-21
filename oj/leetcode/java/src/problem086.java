
public class problem086 {

	public static void main(String[] args) {
		problem086 p = new problem086();
		int[] array = {1,4,3,2,5,2};
		int x = 3;
		ListNode head = p.initListNode(array);
		ListNode resListNode = p.partition(head, x);
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
	
	public ListNode partition(ListNode head, int x) {
		if(head == null || head.next == null) return head;
		ListNode smailHead = new ListNode(0);
		ListNode bigHead = new ListNode(0);
		ListNode smallTmp = smailHead;
		ListNode bigTmp = bigHead;
		while(head!=null){
			if(head.val<x){
				smallTmp.next = head;
				smallTmp = head;
			}else{
				bigTmp.next = head;
				bigTmp = head;
			}
			head = head.next;
		}
		smallTmp.next = null;
		bigTmp.next = null;
		if(smailHead.next == null){
			return bigHead.next;
		}else{
			smallTmp.next = bigHead.next;
			
			return smailHead.next;
		}
		
		
//        return head;
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
