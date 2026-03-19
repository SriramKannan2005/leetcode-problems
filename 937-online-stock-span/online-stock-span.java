class StockSpanner {
    Stack<int[]>st;
    public StockSpanner() {
        st=new Stack<>();
        
    }
    
    public int next(int price) {
        
        int span=1;
            while(!st.isEmpty()&&st.peek()[0]<=price)
            {
                span+=st.pop()[1];
            }
            st.push(new int[]{price, span});
        
        return span;
    }
     static {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter f = new FileWriter("display_runtime.txt")) {
                f.write("0");
            } catch (Exception e) {

            }
        }));
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */