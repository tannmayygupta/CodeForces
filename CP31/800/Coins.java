import java.util.Scanner;
// https://codeforces.com/problemset/problem/1814/A
// A. Coins
public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            // 2*x = n - k*y 
            // lhs = rhs
            if(n % 2 == 0 || (n - k) % 2 == 0){
                // if n is even then its easy to get rhs as even 
                // second if n is odd, then dependency goes to k if it is odd or even 
                // if 2nd term even then not possible so n - k becomes even then we say that x and y can exists
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
