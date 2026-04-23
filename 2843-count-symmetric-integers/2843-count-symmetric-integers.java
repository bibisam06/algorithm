class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int answer = 0; 
        for(int i=low; i<=high; i++){
            if(check(i)) answer++;
        }
        return answer; 
    }

    static boolean check(int num){
        String string = String.valueOf(num);
        char[] chars = string.toCharArray();
        int n = chars.length;
        boolean flag = false;

        if(n % 2 ==1 ) return false; 
        int leftSum = 0;
        int rightSum = 0; 
        for(int i=0; i<n/2; i++){
            leftSum += Integer.parseInt(String.valueOf(chars[i]));
        }

        for(int i=n/2; i<n; i++){
            rightSum += Integer.parseInt(String.valueOf(chars[i]));
        }

        if(leftSum == rightSum ) flag = true;
        return flag;
    }
}