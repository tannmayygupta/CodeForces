import java.util.Scanner;

public class DeadlyLaser {
    public static void main(String[] args) {
        // r 0 l
        // 0 0 d

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int sx = sc.nextInt();
            int sy = sc.nextInt();

            int d = sc.nextInt();

            // // check of the conditions

            // // top blocked means niche jaaa sakega

            // boolean topblocked = sx - 1 <= d ;

            // // bottom blocked means
            // boolean bottomblock = sx + d >= n ;

            // // left blocked means
            // boolean leftblock = sy - 1 <= d ;

            // //right blocked means
            // boolean rightblocked = sy + d >= m ;

            // boolean topandright = topblocked && rightblocked ;
            // boolean bottomandleft = leftblock && bottomblock ;

            // if(topandright || bottomandleft){
            // System.out.println("-1");
            // }else{
            // System.out.println(n+m - 2);
            // }

            boolean blocksTopOrLeft = (sx - d <= 1) || (sy - d <= 1);

            // Check if the bottom-right path is blocked
            boolean blocksBottomOrRight = (sx + d >= n) || (sy + d >= m);

            if (blocksTopOrLeft && blocksBottomOrRight) {
                System.out.println(-1);
            } else {
                System.out.println(n + m - 2);
            }
        }
    }
}
