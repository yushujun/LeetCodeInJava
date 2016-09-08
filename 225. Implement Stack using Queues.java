class MyStack {
    private int[] queue1 = new int[1000000];
    private int[] queue2 = new int[1000000];
    private int top1 = 0,tail1 = 0;
    private int top2 = 0,tail2 = 0;
    private int size = 0;
    // Push element x onto stack.
    public void push(int x) {
        if(top1 == tail1) queue2[tail2++] = x;
        else queue1[tail1++] = x;
        size++;
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(top2 == tail2){
            while(top1+1 != tail1) queue2[tail2++] = queue1[top1++];
            top1 = tail1;
        }
        else {
            while(top2+1 != tail2) queue1[tail1++] = queue2[top2++];
            top2 = tail2;
        } 
        size--;
    }

    // Get the top element.
    public int top() {
        if(top1 != tail1) return queue1[tail1-1];
        else return queue2[tail2-1];
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return size == 0;
    }
}
如果要是实现在O(1)时间内获得队列最大元素，使用一个记录最大值得辅助栈即可，O(1)获得栈最大元素一样