public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1;i <= numRows;i++){
            List<Integer> tempList = new ArrayList<>();
            if(i == 1) {
                tempList.add(1);
            } else {
                tempList.add(1);
                for(int j = 1; j <= i-2;j++){
                    List<Integer> curList = list.get(i-2);
                    int curVal = curList.get(j-1)+curList.get(j);
                    tempList.add(curVal);
                }
                tempList.add(1);
            }
            list.add(tempList);
        }
        return list;
    }
}
time complexity:O(n^2)
