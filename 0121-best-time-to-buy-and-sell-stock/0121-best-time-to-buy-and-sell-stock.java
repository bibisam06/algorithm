class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int answer = 0;
        //단조 감소인 경우, 
        if(check(prices)) return 0; 
        //단조감소가 아닌경우, 여기로 넘어와서 .. 
        //최솟값구하고 
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i=0; i<n-1; i++){
            if(prices[i]< min){
                minIndex = i;
                min = prices[i]; 
            }
        }
        
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i=minIndex; i<n; i++){
            if(prices[i] > max && prices[i] > min){
                max = prices[i];
                maxIndex = i;
            }
        }

        //System.out.println(max-min);
        answer = max - min;
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