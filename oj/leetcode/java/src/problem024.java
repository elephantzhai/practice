public class problem024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem024 pro = new problem024();
		pro.test();
		
	}
	
	public void test(){
//		int[] nums = {1};
//		int[] nums = {1,2,3,4,5};
		int[] nums = {1,2,3,4,5,6};
		ListNode head = initListNode(nums);
		printListNode(head);
		ListNode res = swapPairs(head);
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

	public ListNode swapPairs(ListNode head) {
		ListNode res = null,pre = null,first = null,second = null,temp = null;
		first = head;
		if(head!=null){
			second = head.next;
			if(second!= null){
				temp = second.next;
				res = second;
				pre = first;
				second.next = first;
				first.next = temp;
			}else{
				return head;
			}
		}else{
			return head;
		}
		while(true){
			first = pre.next;
			if(first!=null){
				second = first.next;
//				System.out.print("first:"+first.val);
				if(second!=null){
//					System.out.println(" second:"+second.val);
					temp = second.next;
					pre.next = second;
					pre = first;
					second.next = first;
					first.next = temp;
				}else{
					break;
				}
			}else{
				break;
			}
		}
		System.out.println();
		
		return res;
	}
	
	public ListNode initListNode(int[] nums){
		if(nums.length<=0){
			return null;
		}
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
