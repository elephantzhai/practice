import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class problem023 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		int[][] nums = {{1,2},{2,3}};
		List<ListNode> lists = initListNode(nums);
		System.out.println("condition:");
		printList(lists);
		ListNode res = mergeKLists(lists);
		System.out.println("result:");
		printListNode(res);
	}

	public static ListNode mergeKLists(List<ListNode> lists) {
		ListNode res = null,pre = null,temp = null;
		PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(10,new Comparator<ListNode>(){  
            @Override  
            public int compare(ListNode n1, ListNode n2)  
            {  
                return n1.val-n2.val;  
            }  
        });
		for(int i=0;i<lists.size();i++){
			temp = lists.get(i);
			if(temp!=null){
				heap.offer(temp);
			}
		}
		pre = null;
		res = null;
		while(heap.size()>0){
			temp = heap.poll();
			if(res ==null){
				res = temp;
				pre = res;
			}else{
				res.next = temp;
				res = temp;
			}
			temp = temp.next;
			if(temp!=null){
				heap.offer(temp);
			}
		}
		
		
		
		return pre;
	}

	public static List<ListNode> initListNode(int[][] nums) {
		List<ListNode> res = new ArrayList<ListNode>();
		for(int j=0;j<nums.length;j++){
			ListNode head = new ListNode(nums[j][0]);
			ListNode temp = head;
			for (int i = 1; i < nums[j].length; i++) {
				temp.next = new ListNode(nums[j][i]);
				temp = temp.next;
			}
			res.add(head);
		}
		return res;
	}

	public static void printListNode(ListNode head) {
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
	public static void printList(List<ListNode> lists) {
		for(int i=0;i<lists.size();i++){
			System.out.print("List "+i+":");
			printListNode(lists.get(i));
		}
	}
}
