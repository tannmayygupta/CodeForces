import java.util.Scanner;
// A. Vanya and Fence
// https://codeforces.com/contest/677/problem/A

public class VanyaandFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();

        int[] arr = new int[n];

        int ans = 0 ;

        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();

            if(arr[i] > h){
                ans+= 2 ;
            }else{
                ans+= 1 ;
            }
        }

        System.out.println(ans);

    }
}
