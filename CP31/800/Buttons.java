import java.util.Scanner;
// https://codeforces.com/problemset/problem/1858/A
// Buttons
public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            if(c % 2 == 0){
                // anna turn
                // 5 4    a4 b3 a3 2 a2 1 a1 b0
                if(a > b){
                    System.out.println("First");
                }else{
                    System.out.println("Second");
                }
            }else{
                // katies turn
                // 4 5 4b 3a 3b 2a 2b 1a 1b 0a 
                if(a < b){
                    System.out.println("Second");
                }else{
                    System.out.println("First");
                }
            }
        }
    }
}
