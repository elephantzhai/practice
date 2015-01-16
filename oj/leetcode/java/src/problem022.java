import java.util.ArrayList;
import java.util.List;


public class problem022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> res = generateParenthesis(n);
		for(int i=0;i<res.size();i++){
			System.out.println(res.get(i));
		}

	}
	public static List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<String>();
        char[] strs = new char[n*2];
        strs[0] = '(';
        solve(ret, strs, n-1, n,n);
        return ret;
    }
	
	public static void solve(List<String> ret,char[] strs,int l,int r,int n){
		if (l == 0 && r == 0){
			ret.add(String.valueOf(strs));
			return;
		}
		if(l>0){
			strs[n*2-r-l] = '(';
			solve(ret, strs, l-1, r,n);
		}
		if(r>l){
			strs[n*2-r-l] = ')';
			solve(ret, strs, l, r-1,n);
		}
		
	}

}
