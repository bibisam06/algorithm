import java.util.*; 

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();

        char[] ransom = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();

        for(int i=0; i<magazine.length(); i++){
            magazineMap.put(mag[i], magazineMap.getOrDefault(mag[i], 0) + 1);
        }

        for(int i=0; i<ransomNote.length(); i++){
            ransomMap.put(ransom[i], ransomMap.getOrDefault(ransom[i], 0) + 1);
        }

        for(char c : ransomMap.keySet()){
            int magCount = magazineMap.getOrDefault(c, 0);
            if(magCount < ransomMap.get(c)){
                return false;
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna