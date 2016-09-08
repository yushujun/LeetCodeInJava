public class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[10000];
        int top = 0;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{')
                stack[top++] = c;
            else {
                if(top == 0) return false;
                if(c == ')' && stack[top-1] != '(') return false;
                if(c == ']' && stack[top-1] != '[') return false;
                if(c == '}' && stack[top-1] != '{') return false;
                top--;
            }
        }
        return top == 0;
    }
}
time complexity:O(n)
space complexity:O(n)

public class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[10000];
        int top = 0;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == '(') stack[top++] = ')';
            else if(c == '[') stack[top++] = ']';
            else if(c == '{') stack[top++] = '}';
            else if(top == 0 || c != stack[--top]) return false;
        }
        return top == 0;
    }
}
time complexity:O(n)
space complexity:O(n)