import java.util.Scanner;

public class JellyfishandUndertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            long a = sc.nextLong() ;

            long b = sc.nextLong() ;

            int n = sc.nextInt() ;

            int[] tools = new int[n];

            for(int i = 0 ; i < n ; i++){
                tools[i] = sc.nextInt() ;
            }

            long ans = b - 1 ;

            b = 1 ; 

            for(int i = 0 ; i < n ; i++){
                b = Math.min(b + tools[i], a) ;
                ans += b - 1 ;
                b = 1 ;     
            }

            System.out.println(ans+1);

        }
    }
}
