import java.util.*;
/*
1920번 : 수 찾기(실버4)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        //입력받기 끄읕

        for(int i : nums2){
            if(BinarySearch(nums, i, 0, nums.length-1)){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);

    }

    public static boolean BinarySearch(int[] nums, int target, int start, int end){


        if(start> end){
            return false;
        }

        int mid = (start+end)/2;
        if(nums[mid]<target){  //오른쪾 반쪾으로가서탐색
            return BinarySearch(nums, target, mid+1, end);
        }else if(nums[mid] == target){ //nums[mid] > target -> 왼쪾반쪽으로가서탐색
            return true;
        }else{
            return BinarySearch(nums,target, start, mid-1);
        }

    }
}
