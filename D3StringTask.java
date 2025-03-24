import java.util.Scanner;

public class D3StringTask{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String s1 = s.toLowerCase();


        // "A", "O", "Y", "E", "U", "I"

        String s2 = "";
        
        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i) ;
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'o' || s1.charAt(i) == 'y' || s1.charAt(i) == 'e' || s1.charAt(i) == 'u' || s1.charAt(i) == 'i'){
                continue ;
            }
            else{
                s2 += ch;
            }
        }

        // now string without vowel 

        String s4 = "";
        
        for(int i = 0 ; i < s2.length() ; i++){
            s4 += '.'  + String.valueOf(s2.charAt(i));
        }

        System.out.println(s4);
    }
}

// aBAcAba