import java.util.*;

public class D11cAPSlOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char c = s.charAt(0);

        String s1 = s.substring(1);

        boolean b1 = FirstLetterCap(c);

        boolean b2 = SubStringUpper(s1);

        if(b1 == true && b2 == true ){
            System.out.println( (char) (c + 32) + s1.toLowerCase());
        }
        else if(b1 != true && b2 == true){
            System.out.println((char) (c - 32) + s1.toLowerCase());
        }
        else{
            System.out.println(s);
        }
    }

    public static boolean FirstLetterCap(char c){
        if(c >= 'A' && c <= 'Z'){
            return true ;
        }
        return false ;
    }

    public static boolean SubStringUpper(String s1){

        for(int i = 0 ; i < s1.length() ; i++){
            char c1 = s1.charAt(i);
            if(c1 >= 'a' && c1 <= 'z'){
                return false ;
            }
        }
        return true ;
    }

}
