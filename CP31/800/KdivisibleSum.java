import java.util.Scanner;

public class KdivisibleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int i = 1 ;

            int ans = 0 ;

            while(true){
                if(n * i % k == 0){
                    ans = i ;
                    break;
                }
                i++;
            }

            System.out.println(ans);

        }
    }
}
