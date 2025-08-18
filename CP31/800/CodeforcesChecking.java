import java.util.Scanner;
// A. Codeforces Checking
// 

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t!=0){
            boolean[] cf = new boolean[26];
            // codeforces
            cf[2] = true ; // c
            cf[14] = true ; // o
            cf[3] = true ; // d
            cf[4] = true ; // e
            cf[5] = true ; // f
            cf[17] = true ; // r
            cf[18] = true ; // s
            
            char ch = sc.next().charAt(0);
            int c = ch - 'a';
            if(cf[c]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

            t--;
        }
    }
}
