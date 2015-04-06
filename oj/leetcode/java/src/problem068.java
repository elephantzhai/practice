import java.util.ArrayList;
import java.util.List;

public class problem068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"This", "is", "an", "example", "of", "text", "justification."};
		int len = 16;
//		String[] strs = {""};
//		int len = 0;
		List<String> resList = fullJustify(strs, len);
		for(int i=0;i<resList.size();i++){
			System.out.println(resList.get(i)+"|");
		}
	}

	public static List<String> fullJustify(String[] words, int L) {
		ArrayList<String> res = new ArrayList<String>();
		ArrayList<String> line = new ArrayList<String>();
		int lineLen=0;
		String word;
		for(int j=0;j<words.length;j++){
			word = words[j];
			if(lineLen==0){
				line.add(word);
				lineLen += word.length();
			}else{
				if(lineLen+1+word.length()>L){
					String lineString = processLine(line, L,false);
					res.add(lineString);
					lineLen = 0;
					line.clear();
					j--;
				}else{
					line.add(word);
					lineLen +=1+word.length();
				}
			}
		}
		String lineString = processLine(line, L,true);
		res.add(lineString);
		
		
		
		
		return res;
	}
	
	public static String processLine(ArrayList<String> line,int L,boolean islast){
		int size = line.size();
		StringBuilder sb = new StringBuilder();
		int nowLen = 0;
		if(islast){
			if(size ==1){
				sb.append(line.get(0));
				nowLen = line.get(0).length();
				
				for(int i = nowLen;i<L;i++){
					sb.append(' ');
				}
			}else{
				int wordsLen=0;
				for(String str:line){
					wordsLen+=str.length();
				}
				
				sb.append(line.get(0));
				for(int i = 1;i<size;i++){
					sb.append(' ');
					sb.append(line.get(i));
				}
				int leftSp = L - wordsLen-(size-1);
				for(int i=0;i<leftSp;i++){
					sb.append(' ');
				}
			}
		}else{
			if(size ==1){
				sb.append(line.get(0));
				nowLen = line.get(0).length();
				
				for(int i = nowLen;i<L;i++){
					sb.append(' ');
				}
				
			}else{
				int wordsLen=0;
				for(String str:line){
					wordsLen+=str.length();
				}
				int avgIndiv = (L-wordsLen)/(size-1);
				int leftIndiv = (L-wordsLen)%(size-1);
				for(int i=0;i<size;i++){
					String word = line.get(i);
					sb.append(word);
					nowLen += word.length();
					if(i != size-1){
						for(int k = 0;k<avgIndiv;k++){
							sb.append(' ');
						}
						nowLen+=avgIndiv;
						if(leftIndiv>0){
							sb.append(' ');
							leftIndiv--;
						}
					}
				}
			}
		}
		
		
		
		return sb.toString();
	}

}
