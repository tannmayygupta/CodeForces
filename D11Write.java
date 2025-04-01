import java.util.*;

public class D11Write {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count1 = 0 ;
        int count2 = 0 ; 

        for(int i = 0 ; i < s.length() ; i++){
            char s1 = s.charAt(i) ;
                if(s1 >= 'a' && s1 <= 'z'){
                    count1++;
                }
                else{
                    count2++;
                }
        }
        if(count1 >= count2){ // string humara lowercase
            System.out.println(s.toLowerCase());
        }
        else{ // upercase
            System.out.println(s.toUpperCase());
        }
    }
}








