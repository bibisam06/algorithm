class Solution {
    public boolean isPalindrome(String s) {
       
        
        char[] schar = s.toCharArray(); 
        StringBuilder sb = new StringBuilder(); 

   
        for(int i=0; i<schar.length; i++){
            if(Character.isLetterOrDigit(schar[i])){
                sb.append(schar[i]);
            }
        }

    
        String lower = sb.toString().toLowerCase();
        StringBuilder sb2 = new StringBuilder(lower);
        String reversed = sb2.reverse().toString();

       
        return lower.equals(reversed); 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna