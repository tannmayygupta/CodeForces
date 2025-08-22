import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String t = sc.nextLine();

        int i = 0;
        int j = t.length() - 1;

        int flag = 0;

        if (s.length() != t.length()) {
            System.out.println("NO");
            return;
        }

        while (i < s.length() && j >= 0) {

            if (s.charAt(i) != t.charAt(j)) {
                flag = 1;
                break;
            }

            i++;
            j--;
        }

        if (flag == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
