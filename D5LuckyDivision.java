import java.util.*;

public class D5LuckyDivision{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 474
        // 4
        // 7

        // 4

        

        if(n % 4 == 0 || n % 7 == 0 || n % 47 == 0 || n % 74 == 0 || n % 477 == 0 || n % 474 == 0 || n % 774 == 0 || n % 747 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}