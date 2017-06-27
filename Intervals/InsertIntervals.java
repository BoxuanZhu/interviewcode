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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if(intervals.size() == 0){
            intervals.add(newInterval);
            return intervals;
        }
        List<Interval> rst = new ArrayList<Interval>();
        for(int i = 0; i < intervals.size(); i ++){
            Interval tmp = intervals.get(i);
            //current interval is in front of the newInterval
            if(tmp.end < newInterval.start)
                rst.add(tmp);
            //finished adding the interval, continue to add rest of the intervals
            else if(tmp.start > newInterval.end){
                System.out.println("tmp is ["+ tmp.start +"] , ["+tmp.end+"]");
                rst.add(newInterval);
                newInterval = tmp;
            }
            //the tmp interval overlap with the newInterval, then update to make a new newInterval
            else{
                int start = Math.min(tmp.start, newInterval.start);
                System.out.println("start is "+ start);
                int end = Math.max(tmp.end, newInterval.end);
                newInterval = new Interval(start, end);
            }
        }
        rst.add(newInterval);
        return rst;
    }
}