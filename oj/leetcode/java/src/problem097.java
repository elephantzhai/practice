

public class problem097 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aabcc";
		String s2 = "dbbca";
		String s3 = "aadbbcbcac";
//		String s1 = "";
//		String s2 = "abc";
//		String s3 = "abc";
		boolean res = isInterleave(s1, s2, s3);
		System.out.println("res:"+res);

	}
	
	public static  boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()) return false;
        boolean[][] matrix = new boolean[s1.length()+1][s2.length()+1];
        char c1,c2,c3;
        matrix[0][0] = true;
        for(int i = 0;i<s1.length();i++){
        	System.out.println(1);
        	c1 = s1.charAt(i);
        	c3 = s3.charAt(i);
        	if(c1 == c3){
        		matrix[i+1][0] = true;
        	}else{
        		break;
        	}		
        }
        
        for(int j = 0;j<s2.length();j++){
        	System.out.println(2);
        	c2 = s2.charAt(j);
        	c3 = s3.charAt(j);
        	if(c2 == c3){
        		matrix[0][j+1] = true;
        	}else{
        		break;
        	}
        }
        
        for(int i = 1;i<=s1.length();i++){
        	System.out.println(3);
        	c1 = s1.charAt(i-1);
        	for(int j=1;j<=s2.length();j++){
        		System.out.println(4);
        		c2 = s2.charAt(j-1);
        		int k = i+j;
        		c3 = s3.charAt(k-1);
        		if(c1 == c3){
        			matrix[i][j] = matrix[i-1][j] | matrix[i][j];
        		}
        		if(c2 == c3){
        			matrix[i][j] = matrix[i][j-1] | matrix[i][j];
        		}
        	}
        }
        
        
        return matrix[s1.length()][s2.length()];
    }

}
