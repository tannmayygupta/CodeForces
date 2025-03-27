import java.util.Scanner;

public class D6Bitpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = 0 ;

        for(int i = 0 ; i <= n ; i++){
            String s = sc.nextLine();
            if( s.equals("++X") || s.equals("X++") ){
                X = X + 1 ;
            }
            if(s.equals("--X") || s.equals("X--") ){
                X = X - 1 ;
            }
        }
        System.out.println(X);
    }
}







