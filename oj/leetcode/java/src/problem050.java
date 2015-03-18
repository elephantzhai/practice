
public class problem050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.0;
		int n = 3;
		double res = pow(x, n);
		System.out.println("res:"+res);
	}
	
	public static double pow(double x, int n) {
        if(n<0){
        	return 1.0/power(x, -n);
        }else{
        	return power(x, n);
        }
    }
	
	public static double power(double x,int n){
		if (n == 0){
			return 1.0;
		}
		double v = power(x, n/2);
		if(n%2 == 0){
			return v*v;
		}else{
			return v*v*x;
		}
	}
	
	

}
