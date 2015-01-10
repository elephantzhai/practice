
public class problem011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,2,3};
		System.out.println(maxArea2(height));
	}
	public static int maxArea(int[] height) {
		int len = height.length;
		int start = 0;
		int end = len-1;
		int v = 0;
		int heightS=height[0],heightE=height[len-1];
		int posS=0,posE = len-1;
		int temp;
		while(start<end){
			System.out.println(start+" "+end);
			temp = height[start];
			if(temp>=heightS){
				v += heightS*(start-posS);
				heightS = temp;
				posS = start;
			}
			start++;
//			System.out.println("hs:"+heightS+" ps:"+posS);
			
			temp = height[end];
			if(temp>=heightE){
				v+= heightE*(posE - end);
				heightE = temp;
				posE = end;
			}
			end--;
//			System.out.println("he:"+heightE+" pe:"+posE);
			
		}
		
		v += Math.min(heightS, heightE)+(posE-posS);
		
		return v;
    }
	public static int maxArea2(int[] height) {
		int len = height.length;
		int start = 0;
		int end = len-1;
		int v = 0;
		int heightS = height[0],heightE = height[end];
		while(start<end){
			
			int temp = (end-start)*Math.min(heightS, heightE);
			v = Math.max(v, temp);
			if(heightS>heightE){
				end --;
				heightE = height[end];
			}else{
				start++;
				heightS = height[start];
			}
		}
		
		return v;
    }

}
