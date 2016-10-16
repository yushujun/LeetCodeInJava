public class Solution {
    public int[][] reconstructQueue(int[][] people) {
       Arrays.sort(people,(p1,p2)->p1[0] != p2[0] ? p2[0]-p1[0] : p1[1]-p2[1]);
       List<int[]> temp = new ArrayList<>();
       for(int[] person:people)
            temp.add(person[1],person);
       return temp.toArray(new int[people.length][]);
    }
}
time complexity:O(n^2)
space compelxity:O(n)