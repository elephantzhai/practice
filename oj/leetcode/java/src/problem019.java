public class problem019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem019 pro = new problem019();
		pro.test();
		
	}
	
	public void test(){
//		int[] nums = {1};
//		int target = 1;
//		int[] nums = {1,2,3,4,5};
		int target = 2;
		int[] nums = {1,2};
		ListNode head = initListNode(nums);
		printListNode(head);
		ListNode res = removeNthFromEnd(head, target);
		printListNode(res);
		
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		int i=0;
		ListNode longNode = head;
		if(head == null){
			return head;
		}
		for(i=0;i<n;i++){
			if (longNode==null){
				break;
			}
			longNode = longNode.next;
		}
		if(i != n){
			return head;
		}
		if(longNode == null){
			return head.next;
		}
		
		ListNode shortNode = head;
		while(longNode.next!= null){
			shortNode = shortNode.next;
			longNode = longNode.next;
		}
		if(shortNode.next!=null){
			shortNode.next = shortNode.next.next;
		}
		
		return head;
	}
	
	public ListNode initListNode(int[] nums){
		
		ListNode head = new ListNode(nums[0]);
		ListNode temp = head;
		for(int i=1;i<nums.length;i++){
			temp.next = new ListNode(nums[i]);
			temp = temp.next;
		}
		return head;
	}
	
	public void printListNode(ListNode head){
		ListNode temp  = head;
		while(true){
			if (temp == null){
				break;
			}
			System.out.print(temp.val+"--> ");
			temp = temp.next;
		}
		System.out.println();
	}
	

}
