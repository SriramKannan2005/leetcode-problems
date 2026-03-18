class BrowserHistory {
    class Node
    {
        Node next;
        Node prev;
        String url;
        Node(String url)
        {
            this.url=url;
        }
    }
    int steps=0;
    Node curr;
    public BrowserHistory(String homepage) {
        curr=new Node(homepage);
    }
    
    public void visit(String url) {
        Node newnode=new Node(url);
        curr.next=newnode;
        newnode.prev=curr;
        curr=curr.next;
    }
    
    public String back(int steps) {
        while(steps>0&&curr.prev!=null)
        {
            curr=curr.prev;
            steps--;
        }
        return curr.url;
        
    }
    
    public String forward(int steps) {
        while(steps>0&&curr.next!=null)
        {
            curr=curr.next;
            steps--;
        }
        return curr.url;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */