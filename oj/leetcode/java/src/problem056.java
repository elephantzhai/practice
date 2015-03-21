import java.util.ArrayList;
import java.util.List;


public class problem056 {
	
	
//	  Definition for an interval.
	  
	public class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem056 pro = new problem056(); 
		int[][] data = {{1,3},{2,6},{8,10},{15,18}};
		List<Interval> list = pro.productList(data);
		List<Interval> res = pro.merge(list);
		print(res);
		
	}
	
	public List<Interval> productList(int[][] data){
		ArrayList<Interval> list = new ArrayList<Interval>();
		for(int i =0;i<data.length;i++){
			list.add(new Interval(data[i][0], data[i][1]));
		}
		return list;
	}
	
	public static void print(List<Interval> list){
		for(int i=0;i<list.size();i++){
			Interval interval = list.get(i);
			System.out.print("["+interval.start+","+interval.end+"] ");
		}
		System.out.println();
	}
	
	public  List<Interval> merge(List<Interval> intervals) {
		ArrayList<Interval> res = new ArrayList<Interval>();
		
		for(int i=0;i<intervals.size();i++){
			insert(res, intervals.get(i));
		}
		return res;
    }
	
	public void insert(List<Interval> list,Interval newInterval){
		if(list.size()==0){
			list.add(newInterval);
			return;
		}
		int len = list.size();
		Interval in;
		for(int i=0;i<len;){
			in = list.get(i);
			if(newInterval.end<in.start){
				list.add(i, newInterval);
				return;
			}else if (newInterval.start>in.end) {
				i++;
				continue;
			}else{
				newInterval.start = Math.min(newInterval.start, in.start);
				newInterval.end = Math.max(newInterval.end, in.end);
				list.remove(i);
				len -- ;
			}
		}
		list.add(newInterval);
	}

}
