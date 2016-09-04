public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list1 = new ArrayList<>(); 
        list1.add(1);
        List<Integer> list2 = new ArrayList<>();
        for(int i = 1;i <= rowIndex;i++){
            for(int j = 0;j <= i; j++){
                if(j == 0 || j == i)
                    list2.add(1);
                else
                    list2.add(list1.get(j-1)+list1.get(j));
            }
            list1 = list2;
            list2 = new ArrayList<>();
        }
        return list1;
    }
}
time complexity:O(n)
space complexity:O(k)

public class Solution {
    public List<Integer> getRow(int rowIndex) {
       int[] ans = new int[rowIndex+1];
       ans[0] = 1;
       for(int i = 1;i <= rowIndex;i++){
           for(int j = i; j > 0;j--)
            ans[j] += ans[j-1];
       }
       List<Integer> list = new ArrayList<>();
       for(int i : ans)
        list.add(i);
       return list;
    }
}
time complexity:O(n)
space complexity:O(k)

public class Solution {
    public List<Integer> getRow(int rowIndex) {
       int[] ans = new int[rowIndex+1];
       ans[0] = 1;
       for(int i = 1;i <= rowIndex;i++){
           ans[i] = (int)(((long)ans[i-1]*(rowIndex-i+1))/i);
       }
       List<Integer> list = new ArrayList<>();
       for(int i : ans)
        list.add(i);
       return list;
    }
}
time complexity:O(n)
space complexity:O(k)

Based on rules:
row k of Pascal's Triangle:
[C(k,0), C(k,1), ..., C(k, k-1), C(k, k)]
and
C[k,i] = C[k,i-1]*(k-i+1)/i