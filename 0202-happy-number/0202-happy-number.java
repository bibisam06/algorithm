class Solution {
    public boolean isHappy(int n) {
        if(n == 1) return true; // 1 is happy
        if(n < 10) return false; // 2-9 aren't happy
        
        // Set to detect cycles
        Set<Integer> seen = new HashSet<>();
        
        while(n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = calculate(n); // Use calculated sum and update n
        }
        
        return n == 1;
    }

    public static int calculate(int n){
        int sum = 0;
        while(n > 0) {
            int digit = n % 10; // Get last digit
            sum += digit * digit; // Square and accumulate
            n /= 10; // Remove last digit
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna