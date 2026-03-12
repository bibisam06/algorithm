import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String, String> passwords = new HashMap<>();
        for(int i=0; i<n; i++){
            String page = sc.next();
            String password = sc.next();

            passwords.put(page, password);
        }

        for(int i=0; i<m; i++){
            String findingPage = sc.next();

            System.out.println(passwords.get(findingPage));
        }
    }
}
