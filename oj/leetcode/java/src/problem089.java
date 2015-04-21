import java.util.ArrayList;
import java.util.List;


public class problem089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		List<Integer> resIntegers = grayCode(n);
		for(int i = 0;i<resIntegers.size();i++){
			System.out.print(resIntegers.get(i)+" ");
		}
		System.out.println();
	}
	
	public static List<Integer> grayCode(int n) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        int size = 1<<n;
        for(int i = 0;i<size;i++){
        	res.add(i>>1^i);
        }
        
        return res;
    }

}
