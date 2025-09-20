import java.util.Scanner;
// https://codeforces.com/contest/1702/problem/D
// A. In Search of an Easy Problem
public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt() ;

        int[] arr = new int[n];

        int cou = 0 ;

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 1){
                cou++;
            }
        }

        if(cou >= 1){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }
    }
}
