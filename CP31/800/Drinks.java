import java.util.Scanner;
// B. Drinks
// https://codeforces.com/contest/200/problem/B
public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0 ;
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
        }

        double ans = (double) (sum / (double) n) ;

        System.out.println(ans);
    }
}
