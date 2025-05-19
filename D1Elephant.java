import java.util.Scanner;

public class D1Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cou = 0 ;
        
            while(n > 0){
                if(n >= 5){
                    // n = n - 5 ;
                    cou += n / 5 ;
                    n = n % 5 ;

                }
                else if(n >= 3){
                    // n = n - 3 ;
                    cou += n / 3 ;
                    n = n % 3 ;
                }
                else if(n >= 2){
                    // n = n - 2 ;
                    cou += n / 2 ;
                    n = n % 2 ;
                }
                else if(n >= 1){
                    // n = n - 1 ;
                    cou += n / 1 ;
                    n = n % 1 ;
                }
            }

            System.out.println(cou);

    }
}
