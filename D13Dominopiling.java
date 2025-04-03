import java.util.*;

public class D13Dominopiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt();

        int N = sc.nextInt();

        int areaR = M * N ;

        int areaS = 2 ;

        double s = (double) areaR / areaS ;

        int s1 = (int) Math.floor(s) ;

        System.out.println(s1);

    }
}
