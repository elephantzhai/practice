import com.sun.corba.se.impl.orb.ParserTable.TestAcceptor1;


public class problem002 {

	public static void main(String[] args) {
		problem002 p = new problem002();

	}
	
	public problem002() {
		int[] array1 = {1,8};
		int[] array2 = {0};
		ListNode l1 = makeListNode(array1);
		ListNode l2 = makeListNode(array2);
		ListNode res = addTwoNumbers(l1, l2);
		res.print();
		
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode p1 = l1,p2=l2;
		
		ListNode result = new ListNode(0);ListNode temp = result;
		
		int plus_1 = 0;
		int val1,val2,value;
		while(p1!=null || p2!=null){
			val1 =0;
			if(p1!=null){
				val1 = p1.val;
				p1 = p1.next;
			}
			val2=0;
			if(p2!=null){
				val2 = p2.val;
				p2 = p2.next;
			}
			value = (val1+val2+plus_1)%10;
			plus_1 = (val1+val2+plus_1)/10;
			temp.next = new ListNode(value);
			temp = temp.next;
		}
		
		if(plus_1>0){
			temp.next = new ListNode(plus_1);
		}
		
        return result.next;
    }
	
	public ListNode makeListNode(int[] array){
		if (array == null)
			return null;
		else if (array.length == 1)
			return new ListNode(array[0]);
		else{
			ListNode p1 = null,p2;
			p2 = new ListNode(array[array.length-1]);
			for(int i=array.length-2;i>=0;i--){
				p1 = new ListNode(array[i]);
				p1.next = p2;
				p2 = p1;
 			}
			return p1;
		}
		
			
	}
	
	class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
      void print(){
    	  ListNode temp = this;
    	  do{
    		  System.out.print(""+temp.val+"->");
    		  temp = temp.next;
    	  }while(temp!=null);
      }
	}

}


