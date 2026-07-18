import java.util.*; 

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int second = 0;
        int point = 0; 

        while(tickets[k] > 0 ){
            if(tickets[point] != 0){
                tickets[point]--;
                second++;
            }

            point++;
            if(point==tickets.length) point = 0;
        }

        return second;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna