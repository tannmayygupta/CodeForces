import java.util.*;

public class D12NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        String s = Long.toString(n) ;

        // System.out.println(s);

        long count = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '4' || c == '7'){
                count++;
            }
        }

        if(count > 0 && ( count == 4 || count == 7)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
