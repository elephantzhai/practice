

public class problem012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1299;
		System.out.println(intToRoman(num));
	}
	public static String intToRoman(int num) {
        int len =0;int log=10;
        String[] strings = new String[4];
        while(num>0){
        	int tempNum = num%10;
        	strings[len] = getString(len, tempNum);
        	num /= 10;
        	log *= 10;
        	len++;
        }
        String reString = "";
        for(int i= len-1;i>=0;i--){
        	reString+=strings[i];
        }
        
		return reString;
    }
	
	public static String getString(int pos,int num){
		String res = null;
		switch (pos) {
		case 0:
			res = getLuoMaString("V","I","X",num);
			break;
		case 1:
			res = getLuoMaString("L","X","C",num);
			break;
		case 2:
			res = getLuoMaString("D","C","M",num);
			break;
		case 3:
			res = getLuoMaString("","M","",num);
			break;

		
		}
		return res;
	}
	
	public static String getLuoMaString(String fiveChar,String oneChar,String tenChar,int num){
		String resString = "";
		if (num == 5){
			resString = fiveChar;
		}else if(num == 0){
			resString = "";
		}else if(num<4){
			for(int i=0;i<num;i++){
				resString = resString+oneChar;
			}
		}else if(num == 4){
			resString = oneChar+fiveChar;
		}else if(num == 9){
			resString = oneChar + tenChar;
		}else{
			resString = fiveChar;
			for(int i=5;i<num;i++){
				resString += oneChar;
			}
		}
		
		return resString;
	}

}
