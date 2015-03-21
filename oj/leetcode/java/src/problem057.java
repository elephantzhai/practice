import java.util.ArrayList;
import java.util.List;

public class problem057 {

	public class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public static void main(String[] args) {
		problem057 pro = new problem057();
//		int[][] data = {{1,3},{6,9}};
		int [][] data = {{1,5}};
		int start = 2,end = 3;
		List<Interval> res = pro.productList(data);
		Interval interval = pro.productInterval(start, end);
		pro.insert(res, interval);
		print(res);
	}
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		int len = intervals.size();
		Interval in;
		for(int i=0;i<len;){
			in = intervals.get(i);
			if(newInterval.end < in.start){
				intervals.add(i, newInterval);
				return intervals;
			}else if (newInterval.start > in.end) {
				i++;
				continue;
			}else{
				newInterval.start = Math.min(newInterval.start, in.start);
				newInterval.end = Math.max(newInterval.end,in.end);
				intervals.remove(i);
				len --;
			}
		}
		intervals.add(newInterval);
		return intervals;
    }
	
	public List<Interval> productList(int[][] data){
		ArrayList<Interval> list = new ArrayList<Interval>();
		for(int i =0;i<data.length;i++){
			list.add(new Interval(data[i][0], data[i][1]));
		}
		return list;
	}
	
	public Interval productInterval(int start,int end) {
		return new Interval(start, end);
	}
	
	public static void print(List<Interval> list){
		for(int i=0;i<list.size();i++){
			Interval interval = list.get(i);
			System.out.print("["+interval.start+","+interval.end+"] ");
		}
		System.out.println();
	}

}
