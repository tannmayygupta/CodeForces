import java.util.Scanner;

public class VasilijeinCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while(t-- != 0){
            long n = sc.nextLong();

            long k = sc.nextLong();

            long x = sc.nextLong();


            long min_sum = sumcal(k, 1);


            long max_sum = sumcal(k, n - k + 1);

            // System.out.println(max_sum);

            // System.out.println(min_sum);

            if(x <= max_sum && x >= min_sum){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }

    public static long sumcal(long k , long st){
        long sum = 0 ;

        while(k > 0){
            sum += st ;
            st++;
            k--;
        }
        return sum ;
    }
}
