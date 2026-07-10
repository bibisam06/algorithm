class Solution {
    public int[] solution(int[] arr) {
        //엣지케이스 먼저, 
        int[] answer;
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[arr.length-1];
        }
        
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;    
            }
        } //최솟값 찾아주고, 
        
        int k = 0; 
        for(int i=0; i<arr.length; i++){
            if(i == minIndex){
                continue; 
            }else{
                answer[k] = arr[i];
                k++;
            }
        }
        return answer;
    }
}