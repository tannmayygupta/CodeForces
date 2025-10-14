import java.util.Scanner;

public class GoalsofVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();

            int[] arr = new int[n - 1 ];

            int ans = 0 ;

            for(int i = 0 ; i < n - 1 ; i++){
                arr[i] = sc.nextInt();
                ans += arr[i];
            }


            if(ans > 0){
                System.out.println("-"+ans);
            }else{
                System.out.println(Math.abs(ans));
            }

        }
    }
}
