public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
      int s1 = calc(A,B,C,D);
      int s2 = calc(E,F,G,H);
      if((A>=E && B>=F && C<=G && D<=H)||(E>=A && F>=B && G<=C && H<=D))
        return Math.max(s1,s2);
      int duplicateArea = 0;
      if(inRect(A,D,E,F,G,H)&&inRect(C,D,E,F,G,H)){
        duplicateArea = calc(A,F,C,D);
      } else if(inRect(A,D,E,F,G,H)&&inRect(A,B,E,F,G,H)){
        duplicateArea = calc(A,B,G,D);
      } else if(inRect(A,B,E,F,G,H)&&inRect(C,B,E,F,G,H)){
        duplicateArea = calc(A,B,C,H);
      } else if(inRect(C,D,E,F,G,H)&&inRect(C,B,E,F,G,H)){
        duplicateArea = calc(E,B,C,D);
      } else if(inRect(A,D,E,F,G,H)){
        duplicateArea = calc(A,F,G,D);
      } else if(inRect(C,D,E,F,G,H)){
        duplicateArea = calc(E,F,C,D);
      } else if(inRect(A,B,E,F,G,H)){
        duplicateArea = calc(A,B,G,H);
      } else if(inRect(C,B,E,F,G,H)){
        duplicateArea = calc(E,B,C,H);
      } else if(inRect(E,H,A,B,C,D)&&inRect(G,H,A,B,C,D)){
        duplicateArea = calc(E,B,G,H);
      } else if(inRect(E,H,A,B,C,D)&&inRect(E,F,A,B,C,D)){
        duplicateArea = calc(E,F,C,H);
      } else if(inRect(G,F,A,B,C,D)&&inRect(G,H,A,B,C,D)){
        duplicateArea = calc(A,F,G,H);
      } else if(inRect(G,F,A,B,C,D)&&inRect(E,F,A,B,C,D)){
        duplicateArea = calc(E,F,G,D);
      } else if(inRect(E,H,A,B,C,D)){
        duplicateArea = calc(E,B,C,H);
      } else if(inRect(G,H,A,B,C,D)){
        duplicateArea = calc(A,B,G,H);
      } else if(inRect(E,F,A,B,C,D)){
        duplicateArea = calc(E,F,C,D);
      } else if(inRect(G,F,A,B,C,D)){
        duplicateArea = calc(A,F,G,D);
      } else if(E>A && F<B && G<C && H>D) {
        // 没有顶点在另一个矩形的重叠
        duplicateArea = calc(E,B,G,D);
      } else if(A>E && B<F && C<G && D>H){
        duplicateArea = calc(A,F,C,H);
      } else return s1+s2;
      return s1+s2-duplicateArea;
  }

    public boolean inRect(int px,int py,int x1,int y1,int x2,int y2){
        if(px>=x1 && py>=y1 && px<=x2 && py<= y2)
            return true;
        return false;
    }
    public int calc(int leftDownX,int leftDownY,int rightUpX,int rightUpY){
        return (rightUpX-leftDownX)*(rightUpY-leftDownY);
    }
}
time space:O(1)
space complexity:O(1)
这就是纯数学问题

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int s1 = (C-A)*(D-B);
        int s2 = (G-E)*(H-F);
        int up = Math.min(D,H);
        int right = Math.min(C,G);
        int left = Math.max(A,E);
        int down = Math.max(B,F);
        int overlap = 0;
        if(up > down && right > left)
            overlap = (up-down)*(right-left);
        return s1+s2-overlap;
    } 
}