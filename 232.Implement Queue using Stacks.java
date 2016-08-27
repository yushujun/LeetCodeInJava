class MyQueue {
    public int[] stack1 = new int[10000];
    public int[] stack2 = new int[10000];
    public int top1 = 0;
    public int top2 = 0;
    // Push element x to the back of queue.
    public void push(int x) {
        stack1[top1++] = x;
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(top2 != 0){
            top2--;
        } else {
            while(top1 != 0){
                stack2[top2++] = stack1[--top1];
            }
            top2--;
        }
    }

    // Get the front element.
    public int peek() {
      if(top2 != 0){
            return stack2[top2-1];
        } else {
            while(top1 != 0){
                stack2[top2++] = stack1[--top1];
            }
            return stack2[top2-1];
        }
    }

    // Return whether the queue is empty.
    public boolean empty() {
      return top1 == 0 && top2 == 0;   
    }
}