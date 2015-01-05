
public class problem006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "PAYPALISHIRING";
		int row = 3;
		System.out.println(convert(string, row));

	}
	
	public static String convert(String s, int nRows) {
		char[] str = s.toCharArray();
		int strLen = s.length();
		int blockLen = Math.max(nRows*2-2,1);
		int blockNum = s.length()/blockLen;
		if(strLen%blockLen>0) blockNum++;
		StringBuilder sb = new StringBuilder();
		int startPos = 0;
		for(int j=0;j<nRows;j++){
			startPos = 0;
			for(int k=0;k<blockNum;k++){
//				if(j==0){
//					sb.append(str[startPos+j]);
//				}else if (j==nRows-1) {
//					sb.append(str[startPos+j]);
//				}else{
//					sb.append(str[startPos+j]);
//					sb.append(startPos+(blockLen-j));
//				}
				if(startPos+j>=strLen){
					break;
				}else{
					sb.append(str[startPos+j]);
				}
				
				if(j!=0 && j!=nRows-1){
					if(startPos+(blockLen-j)>=strLen){
						break;
					}else{
						sb.append(str[startPos+(blockLen-j)]);
					}
				}
				
				startPos += blockLen;
			}
			
		}
//		System.out.println(sb.toString());
        return sb.toString();
    }

}
