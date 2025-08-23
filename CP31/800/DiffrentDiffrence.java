import java.util.Scanner;
// https://codeforces.com/contest/1772/problem/C
// C. Different Differences
public class DiffrentDiffrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t!=0){

            // eg: x, x+1, x+3, x+6, x+10
            // lets take x = 1 
            //     1, 2, 3,
            int k = sc.nextInt();

            int n = sc.nextInt();

            int ans = 1 ;

            System.out.print(ans+" ");

            for(int i = 1 ; i <= k - 1 ; i++){
                if(n - ans - i  + 1 < k - i){ // check ki the array we are creating is of duplicate elemt and should be in range 
                                              // it should be of max characteristic 

                    // for in case 
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
