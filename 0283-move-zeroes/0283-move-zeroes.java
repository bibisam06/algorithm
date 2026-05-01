class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int counter = 0; 
        for(int i=0; i<n; i++){
            if(nums[i]!= 0) counter++;
        }

        int[] another = new int[counter];
        int index = 0; 
        for(int i=0; i<n; i++){
            if(nums[i] != 0) {
                another[index] = nums[i];
                nums[i] = 0;
                index++;
            }
        }

        for(int i : another){
            System.out.println(i);
        }

        int index2 = 0; 
        
        for(int i=0; i<another.length; i++){
            nums[index2] = another[i];
            index2++;
        }

    }
}