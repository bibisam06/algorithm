/*
    백준 : 1253 좋다
*/
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
       // System.out.println(Arrays.toString(nums));
        int count =0;
        if(nums.length == 2) {
            count = 0;
        }else {
            for(int i=0; i<n; i++) {
                int value = nums[i];
                if(checking(value, nums, i)) count++;
            }
        }

        System.out.println(count);
    }

    public static boolean checking(int value, int[] nums, int index){
        int left =0;
        int right = nums.length -1;


        while(left < right ){
            if(left == index) {
                left ++;
            }

            if( right == index) {
                right --;
            }

            if(left == right) {
                return false;
            }

            int sum = nums[left] + nums[right];

            if(sum == value) {
                return true;
            }
            else if(sum < value) {
                left ++;
            }
            else {
                right --;
            }

        }
        return false;
    }
}
