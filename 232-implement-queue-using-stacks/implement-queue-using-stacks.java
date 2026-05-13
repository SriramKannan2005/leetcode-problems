import java.util.*;

class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {

        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {

        // move all from s1 to s2
        while (!s1.isEmpty()) {

            s2.push(s1.pop());
        }

        // push new element
        s1.push(x);

        // move back to s1
        while (!s2.isEmpty()) {

            s1.push(s2.pop());
        }
    }

    public int pop() {

        if (s1.isEmpty()) {

            return -1;
        }

        return s1.pop();
    }

    public int peek() {

        if (s1.isEmpty()) {

            return -1;
        }

        return s1.peek();
    }

    public boolean empty() {

        return s1.isEmpty();
    }
}