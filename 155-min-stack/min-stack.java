class MinStack {
    Stack<Integer>st=new Stack<>();
    Stack<Integer>minst=new Stack<>();

    int min=Integer.MAX_VALUE;

    public MinStack() {

        
    }
    
    public void push(int val) {
        if(st.isEmpty())
        {
            st.push(val);
            minst.push(val);
        }
        else
        {
            min=Math.min(val,minst.peek());
            minst.push(min);
            st.push(val);
        }

    }
    
    public void pop() {
        st.pop();
       
        minst.pop();
       
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */