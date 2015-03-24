public class problem061 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5};
		int k = 2;
		problem061 pro = new problem061();
		ListNode head = pro.produceList(data);
		ListNode res = pro.rotateRight(head, k);
		pro.print(res);
		
	}

	public ListNode rotateRight(ListNode head, int k) {
		if(k == 0 || head == null){
			return head;
		}
		ListNode p1;
		int len = 1;
		p1 = head;
		while(p1.next!=null){
			p1 = p1.next;
			len++;
		}
		k =len - k%len;
		p1.next = head;
		int step = 0;
		while(step<k){
			p1 = p1.next;
			step++;
		}
		head = p1.next;
		p1.next = null;
		return head;
	}
	
	public void print(ListNode head){
		ListNode temp = head;
		while(temp!=null){
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public ListNode produceList(int[] ints){
		ListNode head = new ListNode(0);
		ListNode temp = head;
		for(int i = 0;i<ints.length;i++){
			temp.next = new ListNode(ints[i]);
			temp = temp.next;
		}
		return head.next;
	}

}
