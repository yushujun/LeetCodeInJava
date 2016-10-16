backtracking method:
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        find(list,n,n,"");
        return list;
    }
    public void find(List<String> list,int left,int right,String ans){
        if(left < 0)  return ;
        if(left == 0 && right == 0) {
            list.add(ans);
        } else if(left <= right){
            find(list,left-1,right,ans+"(");
            find(list,left,right-1,ans+")");
        }
    }
}
time compelxity:O(n)
space compelxity:O(1)