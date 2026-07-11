import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        int n = strs.length;

        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<n; i++){
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String str2 = String.valueOf(chars);
            if(!map.containsKey(str2)){
                map.put(str2, new ArrayList<>());
                map.get(str2).add(str);
            }else{
                map.get(str2).add(str);
            }
        }

        for(String key : map.keySet()){
            answer.add(new ArrayList<>(map.get(key)));
        }

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna