class Solution {
    public String solution(String s) {
    
        String[] strings = s.split(" ");
        int[] ints = new int[strings.length];
        
        for(int i=0; i<strings.length; i++){
            ints[i] = Integer.parseInt(strings[i]);
        }
        int[] minMax = getMaxAndMin(ints);
        String answer = String.valueOf(minMax[0]) +" " + String.valueOf(minMax[1]);
        return answer;
    }
    
    int[] getMaxAndMin(int[] ints){
        int min = ints[0];
        int max = ints[0];

    for(int i=1; i<ints.length; i++){
        if(ints[i] < min) min = ints[i];
        if(ints[i] > max) max = ints[i];
    }
        
    return new int[]{min, max};
        
    }
    
    
}