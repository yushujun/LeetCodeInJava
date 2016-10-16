backtracking method:
public class Solution {
  public List<List<Integer>> combinationSum3(int k, int n) {
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> comb = new ArrayList<>();
      combination(ans,comb,k,1,n);
      return ans;
  }
  public void combination(List<List<Integer>> ans,List<Integer> comb,int k,int start,int n){
      if(comb.size() == k && n == 0){
          comb = new ArrayList<>(comb);
          ans.add(comb);
          return ;
      } else if(comb.size() > k || n < 0) return ;
      for(int i = start; i <= 9; i++){
          comb.add(i);
          combination(ans,comb,k,i+1,n-i);
          comb.remove(comb.size()-1);
      }
  }
}
time complexity:O(n^2)
space complexity:O(n)