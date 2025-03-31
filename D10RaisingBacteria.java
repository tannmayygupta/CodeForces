import java.util.*;

public class D10RaisingBacteria {
    public static void main(String[] args) {
        int initialBox = 0 ;
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int bacteria = 0 ;

        while(x > 0){
            if(x % 2 == 1){
                bacteria++;
            }
            x = x / 2;
        }

        System.out.println(bacteria);

    }
}
