import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        while (true) {

            if(digit(++year)){
                break ;
            }

        }

        System.out.println(year);

    }

    static boolean digit(int year){
        
        HashSet<Integer> ans = new HashSet<>();

        while(year > 0){
            int rem = year % 10 ;
            if(ans.contains(rem)){
                return false ;
            }
            ans.add(rem);
            year = year/10 ;
        }
        
        return true ;
    } 
}
