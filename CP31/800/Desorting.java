import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();

            long[] arr = new long[n];

            // int max = Integer.MIN_VALUE ;
            // int flag = 0 ;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long minans = Long.MAX_VALUE;

            // 0 1 2 3 4

            //
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] <= arr[i + 1]) {
                    long diff = arr[i + 1] - arr[i];
                    long ans = diff / 2 + 1;
                    minans = Math.min(ans, minans);
                }else{
                    minans = 0 ;
                    break ;
                }
            }

            System.out.println(minans);

            // if(flag == 1){
            // System.out.println("0");
            // }else{
            // // for test case : 1 9 16
            // // 9 become 10 16 become 15
            // // 10 become 11 15 become 14
            // // 11 become 12 and 14 become 13
            // // 12 become 13 13 become 12

            // // jo mini odd diffrence chaiye other
            // // 2 4 6 8 10 12 14

            // }
        }
    }
}
