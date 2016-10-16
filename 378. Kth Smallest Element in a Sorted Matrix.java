insert sort:
public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
          int n = matrix.length;
    int[] arr = new int[n*n];
    int len = 0;
    for(int i = 0; i < n; i ++){
        for(int j = 0; j < n; j++)
            len = insertSort(arr,matrix[i][j],len);
    }
    return arr[k-1];
  }
  public static int insertSort(int[] arr,int val,int len){
    int j = len-1;
    while(j >= 0 && val < arr[j]) j--;
    int i;
    for(i = len-1; i > j; i--)
      arr[i+1] = arr[i];
    arr[i+1] = val;
    return len+1;
  }
}
time complexity:O(n^2)
space complexity:O(n)

min heap:
public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<>(k, Collections.reverseOrder());
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[0].length; j++){
        if(pq.size() < k)
          pq.add(matrix[i][j]);
        else {
          int temp = pq.peek();
          if(temp > matrix[i][j]){
            pq.poll();
            pq.offer(matrix[i][j]);
          }
        }
      }
    }
    return pq.poll();
  }
}
time complexity:O(nlogn)
space complexity:O(n)