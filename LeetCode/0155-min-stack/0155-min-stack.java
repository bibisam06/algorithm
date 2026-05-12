import java.util.*; 

class MinStack {

    Deque<Integer> stack;

    public MinStack() {
        this.stack = new ArrayDeque<>(); //초기화함 
    }
    
    public void push(int val) {
        stack.offerLast(val);
    }
    
    public void pop() { 
        stack.removeLast();
    }
    
    public int top() {
        return stack.peekLast(); 
    }
    
    public int getMin() {
        //always non empty
        int answer = Integer.MAX_VALUE;
        int n = stack.size();

        for(int i=0; i<n; i++){
            int out = stack.removeFirst();
            answer = Math.min(answer, out);
            stack.offerLast(out);
        }
        return answer;
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

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna