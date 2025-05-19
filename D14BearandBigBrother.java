import java.util.*;
public class D14BearandBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int  n = 0 ;

        if(A == B){
            System.out.println(1);
        }
        else{
            while(A < B){
                A += 3*n*A ;
                B += 2*n*B ;
                ++n;
            }
    
            System.out.println(n - 1);
        }
    }
}
