import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.SWAP;


public class problem031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] sou = {7,8,6,9,8,7,2};
		int[] sou = {1,1};
		nextPermutation(sou);
		for(int i:sou){
			System.out.print(i+" ");
		}
		System.out.println();

	}
 
	
	public static void nextPermutation(int[] num) {
		if(num.length<=1){
			return;
		}
        int i,j,turnPos;
        for(turnPos=num.length-1;turnPos>0;turnPos--){
        	if(num[turnPos-1]<num[turnPos]){
        		break;
        	}
        }
        if (turnPos == 0){
        	for(i=0,j=num.length-1;i<j;i++,j--){
        		swap(num, i,j);
        	}
        }
        
        int k = num.length-1;
        if(turnPos>=1){
	        for(;k>=turnPos;k--){
	        	if(num[k]>num[turnPos-1])
	        		break;
	        }
	        System.out.println("k: "+k+" "+num[k]);
	        swap(num, k, turnPos-1);
        }
        
        Arrays.sort(num,turnPos,num.length);
    }
	
	public static void swap(int[] array,int posA,int posB){
		int temp = array[posA];
		array[posA] = array[posB];
		array[posB] = temp;
	}
}
