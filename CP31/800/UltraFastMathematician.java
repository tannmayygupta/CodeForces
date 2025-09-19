import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine() ;

        String s2 = sc.nextLine();

        String ans = "";

        int i = 0 ;

        while(i < s1.length()){
            if(s1.charAt(i) != s2.charAt(i)){
                ans += "1";
            }else{
                ans+="0";
            }
            i++;
        }

        System.out.println(ans);
    }

}
