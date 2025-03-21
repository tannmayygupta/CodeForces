import java.util.Scanner;

public class D1TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();


        long leastTile = ( (long) Math.ceil( (double) m / a ) ) * ( (long) Math.ceil( (double) n / a ) );


        System.out.println(leastTile);

    }
}
