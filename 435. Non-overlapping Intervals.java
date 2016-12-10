greedy:
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
  public int eraseOverlapIntervals(Interval[] intervals){
    Arrays.sort(intervals,(p1,p2)->p1.end!=p2.end?p1.end-p2.end:p2.start-p1.start);
    int end = 1<<31,count = 0;
    for(Interval i : intervals){
      if(i.start >= end) end = i.end;
      else count++;
    }
    return count;
  }
}
time compleixty:O(n^2)
space complexity:O(1)