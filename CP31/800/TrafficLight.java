import java.util.Scanner;

public class TrafficLight{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char ch = sc.next().charAt(0);
            String s = sc.next();

            if (ch == 'g') {
                System.out.println(0);
                continue;
            }

            String s1 = s + s ;

            int i = 0 ; 
            int j = 0 ;

            int max = 0;

            while(i < n){
                while (i < n && s1.charAt(i) != ch) {
                    i++;
                }
                j = i + 1;
                while (j < 2 * n && s1.charAt(j) != 'g') {
                    j++;
                }
                max = Math.max(max, j - i);
                i = j + 1;
            }

            System.out.println(max);

        }


        
    }
}