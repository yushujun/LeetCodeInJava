public class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length <= 1) return points.length;
        Arrays.sort(points,(p1,p2)->p1[1]!=p2[1]?p1[1]-p2[1]:p1[0]-p2[0]);
        int end = points[0][1];
        int count = 1;
        for(int i = 1; i < points.length; i++){
            if(points[i][0] > end){
                end = points[i][1];
                count++;
            }
        }
        return count;
    }
}
time complexity:O(n^2)
space complexity:O(n)