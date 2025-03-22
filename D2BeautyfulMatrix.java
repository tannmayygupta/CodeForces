import java.util.Scanner;

public class D2BeautyfulMatrix {
    public static void main(String[] args) {
        int m = 5 ;
        int n = 5 ;
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[m][n];

        // System.out.println("Enter only 'one' 1 and other zero in the matrix ");

        for(int i = 0 ; i < m  ; i++ ){
            for(int j = 0 ; j < n  ; j++ ){
                arr[i][j] = sc.nextInt();
            }   
            sc.nextLine();
        }

        int step = 1 ;

        for(int i = 0 ; i < m  ; i++ ){
            for(int j = 0 ; j < n  ; j++ ){
                if(arr[i][j] == 1){
                    step = Math.abs(i - 2) + Math.abs(j - 2);
                    break;
                }
            }   
        }

        System.out.println(step);
    }
}
