import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Set<String> setN = new HashSet<>();
        Set<String> setM = new HashSet<>();
        for(int i=0; i<n; i++){
            setN.add(sc.nextLine());
        }
        for(int i=0; i<m; i++){
            setM.add(sc.nextLine());
        }

        List<String> list = new ArrayList<>();
        for (String name : setN) {
            if (setM.contains(name)) { // 탐색 O(1)
                list.add(name);
            }
        }

        Collections.sort(list); // 사전순 정렬
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
