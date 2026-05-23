import java.util.Scanner;
// A. We Need the Zero 
// https://codeforces.com/problemset/problem/1805/A
public class WeNeedtheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;

        while (t--!=0) {
            int n = sc.nextInt() ;
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt() ;
            }

            int xor = 0 ;
            for(int i = 0 ; i < n ; i++){
                xor = xor ^ arr[i];
            }

            if(n % 2 == 0){
                if(xor == 0){
                    System.out.println(1);
                }else{
                    System.out.println(-1);
                }
            }else{
                System.out.println(xor);
            }
        }
    }
}
