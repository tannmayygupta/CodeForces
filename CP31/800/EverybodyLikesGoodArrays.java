import java.util.Scanner;
// A. Everybody Likes Good Arrays!
// https://codeforces.com/problemset/problem/1777/A
public class EverybodyLikesGoodArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] =sc.nextInt();
            }
            int ans = 0 ;

            for(int i = 0 ; i < n - 1 ; i++){
                if(arr[i] % 2 == arr[i+1] % 2){
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
