import java.util.Scanner;
// A. Walking Master
// https://codeforces.com/problemset/problem/1806/A
public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int dai = 0 ;
            int ans = 0 ;
            int flag = 0 ;

            if(b <= d){
                dai = d - b;
                ans += dai ;
            }else{
                flag = 1 ;
            }

            a = a + dai ;
            b = b + dai ;
            int left = 0 ;
            if(a >= c){
                left = a - c ;
                ans+= left ;
            }else{
                flag = 1 ;
            }

            if(flag == 1){
                System.out.println(-1);
            }else{
                System.out.println(ans);
            }


        }
    }
}
