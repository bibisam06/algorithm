class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int answer = 0;
        //단조 감소인 경우, 
        // This check returns 0 early if prices are strictly decreasing.
        // It runs in O(n) time, which is fine, but you could also handle this case in the main loop without a separate check.
        if(check(prices)) return 0; 
        //단조감소가 아닌경우, 여기로 넘어와서 .. 
        // Initialize minPrice to a very large value so any price will be lower.
        // Note: Java's constant is Integer.MAX_VALUE (uppercase MAX), not Integer.MaxValue.
        int minPrice = Integer.MAX_VALUE; 
        
        for(int i=0; i<n; i++){
            int currentPrice = prices[i]; //현재가격집어와서 비교 
            minPrice = Math.min(minPrice, currentPrice);
            int currentGap = currentPrice - minPrice; 
            answer = Math.max(answer, currentGap);
           
            
        }
       
        return answer;
    }

    public boolean check(int[] prices){
        int n = prices.length;

        for(int i=0; i<n-1; i++){
            if(prices[i] < prices[i+1]) return false;
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna