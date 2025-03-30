import java.util.Scanner;

public class D9Capitalization {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        String s = sx.nextLine();
        
        char s1 = s.charAt(0);

        char s2 = toUpperChar(s1);

        System.out.println(s2+s.substring(1));

    }
    public static char toUpperChar(char s1){
        if(s1 >= 'a' && s1 <= 'z'){
            return (char) (s1 - 32);
        }
        return s1 ;
    }
}
