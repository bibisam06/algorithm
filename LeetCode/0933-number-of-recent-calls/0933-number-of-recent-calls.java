import java.util.*;

class RecentCounter {
    
    Deque<Integer> deque;
    int counter = 0; 

    public RecentCounter() {
        this.deque = new ArrayDeque<>();
        counter = 0 ;
    }
    
    public int ping(int t) {
        deque.add(t);
        while(deque.peek() < t-3000){
    deque.poll();
}
        return deque.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna