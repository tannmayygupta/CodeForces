import java.util.Scanner;

public class SoldierBananas {
    // A. Soldier and Bananas
    // https://codeforces.com/contest/546/problem/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int n = sc.nextInt();

        int w = sc.nextInt();

        int m = (w * ( w + 1 ) )/ 2 ;

        int total = m * k ;

        if(total > n){
            System.out.println(total - n );
        }else{
            System.out.println(0);
        }
    }
}
