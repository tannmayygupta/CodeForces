import java.util.Scanner;

public class WrongSubtraction {
    // A. Wrong Subtraction
    // https://codeforces.com/contest/977/problem/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        int k = sc.nextInt();

        while( k!= 0){
            if(N % 10 == 0){
                N = N / 10 ;
            }else{
                N = N - 1 ;
            }
            k--;
        }

        System.out.println(N);
    }
}
