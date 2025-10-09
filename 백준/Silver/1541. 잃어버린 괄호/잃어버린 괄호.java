import java.util.*;
public class Main {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    String[] numbs1 = str.split("-"); //- 로 스플릿 하기

    int start = 0;
    for(int i=0;i<numbs1.length;i++){
        int temp = 0;
        String[] numbs2 = numbs1[i].split("\\+"); //-> escape\\필요함

        for (int j = 0; j < numbs2.length; j++) {
            temp += Integer.parseInt(numbs2[j]);
        }

        if(i ==0 ) start += temp;
        else start -= temp;
    }


    System.out.println(start);


}
}
