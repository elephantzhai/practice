
public class problem069 {

	public static void main(String[] args) {
		int x = 1990;
		int res = sqrt(x);
		System.out.println("res:"+res);
	}
	
	public static int sqrt(int x) {
        if(x == 0)return 0;
        double last = 0;
        double res = 1;
        while(res!=last){
        	last = res;
        	res = (res+x/res)/2;
        }
		return (int) (res);
    }

}
