import java.util.*;

public class D4BoyOrGirl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        HashSet<Character> shash = new HashSet<>();

        for(int i = 0 ; i < s.length() ; i++){
            shash.add(s.charAt(i));
        }

        int x = shash.size();

        if(x % 2 != 0){
            System.out.println("IGNORE HIM!");
        }
        else{
            System.out.println("CHAT WITH HER!");
        }





        // int count = 0 ;

        // // HashSet<Character> shash = new HashSet<>();
        
        // ArrayList<Character> list = new ArrayList<>();

        // for(int i = 0 ; i < s.length() ; i++){
        //     for(int j = i + 1 ; j < s.length() ; j++){
        //         if(s.charAt(i) == s.charAt(j)){
        //             list.add(s.charAt(i));
        //         }
        //     }
        // }

        // Character[] array = list.toArray(new Character[0]);

        // int x = s.length() - array.length ;

        // if(x % 2 != 0){
        //     System.out.println("IGNORE HIM!");
        // }
        // else{
        //     System.out.println("CHAT WITH HER!");
        // }

        // System.out.println(x);
    }
}
