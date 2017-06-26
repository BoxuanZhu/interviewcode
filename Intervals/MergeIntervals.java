/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    
    private class MyComp implements Comparator<Interval>{
        public int compare(Interval a, Interval b){
            return a.start - b.start;
        }
    }
    
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <=1)
            return intervals;
        List<Interval> rst = new ArrayList<Interval>();
        Collections.sort(intervals, new MyComp());
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for(int i = 1; i < intervals.size(); i++){
            Interval tmp = intervals.get(i);
            if(tmp.start <= end)//case of overlapping interval, get the biggest end value
                end = Math.max(end, tmp.end); 
            else{//the tmp interval does not overlap with previous interval
                rst.add(new Interval(start, end));
                start = tmp.start;//the new start and end is updated
                end = tmp.end;
            }
        }
        rst.add(new Interval(start, end));//add the last interval
        return rst;
    }
}