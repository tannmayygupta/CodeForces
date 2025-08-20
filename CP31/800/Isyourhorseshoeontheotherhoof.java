import java.util.HashSet;
import java.util.Scanner;

public class Isyourhorseshoeontheotherhoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();

        int s2 = sc.nextInt();

        int s3 = sc.nextInt();

        int s4 = sc.nextInt();

        HashSet<Integer> ans = new HashSet<>();

        ans.add(s1);
        ans.add(s2);
        ans.add(s3);
        ans.add(s4);

        System.out.println(4-ans.size());
        
    }
}
