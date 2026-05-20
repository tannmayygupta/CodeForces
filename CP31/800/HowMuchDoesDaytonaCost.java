import java.util.Scanner;

public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        // A. How Much Does Daytona Cost?
        // https://codeforces.com/problemset/problem/1878/A

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t--!=0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            boolean kpres = false ;
            for(int i = 0 ; i < n ; i++){
                if(arr[i] == k){
                    kpres = true ;
                }
            }

            if(kpres){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
