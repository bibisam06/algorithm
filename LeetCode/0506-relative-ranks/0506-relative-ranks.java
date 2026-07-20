class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(score[i], i);
        }

        Integer[] sorted = new Integer[n];

        for(int i = 0; i < n; i++){
            sorted[i] = score[i];
        }

        Arrays.sort(sorted, Comparator.reverseOrder());

        for(int i = 0; i < n; i++){
            int index = map.get(sorted[i]);

            if(i == 0) answer[index] = "Gold Medal";
            else if(i == 1) answer[index] = "Silver Medal";
            else if(i == 2) answer[index] = "Bronze Medal";
            else answer[index] = String.valueOf(i + 1);
        }

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna