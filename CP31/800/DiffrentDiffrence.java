import java.util.Scanner;
// https://codeforces.com/contest/1772/problem/C
// C. Different Differences
public class DiffrentDiffrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t!=0){
            int k = sc.nextInt();

            int n = sc.nextInt();

            int ans = 1 ;

            System.out.print(ans+" ");

            for(int i = 1 ; i <= k - 1 ; i++){
                if(n - ans - i  + 1 < k - i){
                    ans++;
                }else{
                    ans += i ;
                }
                System.out.print(ans+" ");

            }

            System.out.println();

            t--;

        }
    }
}
