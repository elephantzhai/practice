
public class problem025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = {1};
//		int[] nums = {1,2,3,4,5};
		int[] nums = {1,2,3,4,5,6};
		int k = 2;
		ListNode head = initListNode(nums);
		printListNode(head);
		ListNode res = reverseKGroup(head,k);
		printListNode(res);
		
	}
	
	public void test(){

		
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	public static ListNode reverse(ListNode pre,ListNode next){
		ListNode last = pre.next;
		ListNode cur = last.next;
		while(cur!=next){
			last.next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = last.next;
		}
		return last;
	}

	public static ListNode reverseKGroup(ListNode head,int k) {
		if(k == 0 || head == null){
			return head;
		}
		ListNode res = null,pre = null,cur = null;
		pre = new ListNode(0);
		res = pre;
		pre.next = head;
		cur = head;
		int i=0;
		while(cur!= null){
			i++;
			if(i%k==0){
				pre = reverse(pre, cur.next);
				cur = pre.next;
			}else{
				cur = cur.next;
			}
		}
		
		
		
		return res.next;
	}
	
	public static ListNode initListNode(int[] nums){
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
	
	public static void printListNode(ListNode head){
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
