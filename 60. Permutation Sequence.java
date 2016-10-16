public class Solution {
    public String getPermutation(int n, int k) {
        char[] ch = new char[n];
        for(int i = 0; i < n; i++)
            ch[i] = (char)('0'+i+1);
        int count = 1;
        while(true){
            if(count == k) return new String(ch);
            int i,j;
            for(i = ch.length-2; i >= 0; i--)
                if(ch[i] < ch[i+1]) break;
                else if(i == 0) return "";
            for(j = ch.length-1; j > i; j--)
                if(ch[j] > ch[i]) break;
            swap(ch,i,j);
            reverse(ch,i+1,ch.length-1);
            count++;
        }
    }
    public void swap(char[] ch,int i,int j){
        if(i != j){
            ch[i] ^= ch[j];
            ch[j] ^= ch[i];
            ch[i] ^= ch[j];
        }
    }
    public void reverse(char[] ch,int start,int end){
        while(start < end){
            ch[start] ^= ch[end];
            ch[end] ^= ch[start];
            ch[start] ^= ch[end];
            start++;end--;
        }
    }
}
time complexity:O(n!)
space complexity:O(1)