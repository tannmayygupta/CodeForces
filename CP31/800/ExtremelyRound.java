import java.util.ArrayList;
import java.util.Scanner;

public class ExtremelyRound {

    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int cou = 0 ;
        for(int i = 1 ; i <= 999999 ; i++){
            if(check(i)){
                cou++;
            }
            ans.add(cou);
        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0) {
            int n = sc.nextInt();
            System.out.println(ans.get(n-1));            
        }
    }
    public static boolean check(int i){
        int nonZero = 0 ;

        while (i > 0) {
            int rem = i % 10 ;
            if(rem != 0){
                nonZero++;
            }
            i = i / 10 ;
        }

        if(nonZero == 1){
            return true ;
        }

        return false ;
    }
}