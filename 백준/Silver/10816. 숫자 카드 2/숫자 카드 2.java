import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);
        int[] nums1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            nums1[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] nums2 = new int[m];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<m; i++){
            nums2[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(nums1);

        StringBuilder sb = new StringBuilder();
        for(int i : nums2){
            int value = upper(i, nums1) - lower(i, nums1);
            sb.append(value).append(' ');
        }
        System.out.println(sb.toString().trim());
    }

    static int upper(int key, int[] arr){
        int l = 0;
        int r = arr.length;
        while(l < r){
            int mid = (l + r) / 2;
            if(arr[mid] > key) r = mid;
            else l = mid + 1;
        }
        return l;
    }

    static int lower(int key, int[] arr){
        int l = 0;
        int r = arr.length;
        while(l < r){
            int mid = (l + r) / 2;
            if(arr[mid] >= key) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}
