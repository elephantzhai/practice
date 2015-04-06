
public class problem072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w1 = "ykyyyab";
		String w2 = "abxxxxx";
		int res = minDistance(w1, w2);
		System.out.println("res:"+res);
	}
	public static int minDistance(String word1, String word2) {
        int rows = word1.length()+1;
        int cols = word2.length()+1;
        int[][] r = new int[rows][cols];
        for(int i=0;i<rows;i++){
        	r[i][0] = i;
        }
        for(int j=0;j<cols;j++){
        	r[0][j] = j;
        }
        for(int i = 1;i<rows;i++){
        	char c1 = word1.charAt(i-1);
        	for(int j=1;j<cols;j++){
        		char c2 = word2.charAt(j-1);
        		if(c1 == c2){
        			r[i][j] = r[i-1][j-1];
        		}else{
        			int edit = r[i-1][j-1]+1;
        			int add = r[i][j-1]+1;
        			int delete = r[i-1][j]+1;
        			int min = edit>add?add:edit;
        			min = min>delete?delete:min;
        			r[i][j] = min;
        		}
        	}
        }
        return r[rows-1][cols-1];
    }
}
