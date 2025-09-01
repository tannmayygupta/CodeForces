import java.util.Scanner;
// https://codeforces.com/contest/469/problem/A
// A. I Wanna Be the Guy
public class IWannaBetheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        sc.nextLine();

        int p = sc.nextInt() ;

        int[] X = new int[p];

        for(int i = 0 ; i < p ; i++){
            X[i] = sc.nextInt() - 1 ;
            arr[X[i]]--;
        }

        sc.nextLine();

        int q = sc.nextInt() ;

        int[] Y = new int[q];

        for(int i = 0 ; i < q ; i++){
            Y[i] = sc.nextInt() - 1;
            arr[Y[i]]--;
        }

        int flag = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 0){
                flag = 1 ;
                break ;
            }
        }

        if(flag == 1){
            System.out.println("Oh, my keyboard!");
        }
        else{
            System.out.println("I become the guy.");
        }
    }
}
