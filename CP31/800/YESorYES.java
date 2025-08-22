import java.util.Scanner;
// A. YES or YES?
// https://codeforces.com/contest/1703/problem/A


public class YESorYES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t!=0) {
            String s = sc.next().toLowerCase();

            if(s.equals("yes")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
            t--;
        }
    }
}
