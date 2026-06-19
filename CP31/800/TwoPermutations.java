import java.util.Scanner;
// https://codeforces.com/problemset/problem/1761/A
// A. Two Permutations
public class TwoPermutations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int a = sc.nextInt() ;
            int b = sc.nextInt() ;
            
            int left = (n - (a + b)) ;

            if((a == b && b == n) || left >= 2){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}