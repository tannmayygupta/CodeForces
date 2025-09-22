import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        // long n = sc.nextLong();

        // long ans = 0 ;

        // for(long i = 1 ; i <= n ; i++){
        //     if(i % 2 == 0){
        //         ans += i ;
        //     }else{
        //         ans -= i ;
        //     }
        // }

        // System.out.println(ans);

        // THIS IS MATHS APPROACH

        long n = sc.nextLong();

        if(n % 2 == 1){

            double half = (double) n / 2 ;

            long num = (long) Math.ceil( half ) ;

            long oddsum = num * num ;

            long evensum = (num - 1) * ( (num - 1) + 1 ) ;

            System.out.println(evensum - oddsum);

        }else{

            long half2 = n / 2 ;

            long sumod = half2 * half2 ;

            long sumev = half2 * (half2 + 1);

            System.out.println(sumev - sumod );

        }
    }
}
