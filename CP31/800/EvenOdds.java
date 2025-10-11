import java.util.Scanner;
// https://codeforces.com/contest/318/problem/A
// A. Even Odds
public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long k = sc.nextLong();

        long m = (n + 1) / 2;

        if (k <= m) {
            long ans = 2 * (k - 1) + 1;
            System.out.println(ans);
        } else {
            k = k - m;
            long ans = 2 * (k - 1) + 2;
            System.out.println(ans);
        }
    }
}
