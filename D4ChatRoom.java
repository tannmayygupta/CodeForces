import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class D4ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String s2 = "hello";

        //  not git the approach for this 

        // if(s.length() < s2.length()){
        //     System.out.println("NO");
        // }

        // if(( s.length() == s2.length() && s.equals(s2) )){
        //     System.out.println("YES");
        // }
        // else{
        //     System.out.println("NO");
        // }


        // for(int i = 0 ; i < s.length() ; i++){
            
        // }


        int position = 0;

        int i;
        for (i = position; i < s.length(); i++) {
            if (s.charAt(i) == 'h') {
                position = i + 1; 
                break;
            }
        }

        if (i == s.length()) {
            System.out.println("NO");
            return;
        }

        for (i = position; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                position = i + 1;
                break;
            }
        }

        if (i == s.length()) {
            System.out.println("NO");
            return;
        }

        for (i = position; i < s.length(); i++) {
            if (s.charAt(i) == 'l') {
                position = i + 1;
                break;
            }
        }

        if (i == s.length()) {
            System.out.println("NO");
            return;
        }

        for (i = position; i < s.length(); i++) {
            if (s.charAt(i) == 'l') {
                position = i + 1;
                break;
            }
        }

        if (i == s.length()) {
            System.out.println("NO");
            return;
        }

        for (i = position; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                position = i + 1; 
                break;
            }
        }
        if (i == s.length()) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");

    }
}
