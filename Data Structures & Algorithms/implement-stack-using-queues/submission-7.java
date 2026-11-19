class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    // time: O(1)
    
    public void push(int x) {
        q.offer(x);
        for (int i = q.size() - 1; i > 0; i--) {
            q.offer(q.poll());
        }
    }
    // time: O(n)
    
    public int pop() {
        return q.poll();
    }
    // time: O(1)
    
    public int top() {
        return q.peek();
    }
    // time: O(1)
    
    public boolean empty() {
        return q.isEmpty();
    }
    // time: O(1)

}
// space: O(n)

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */