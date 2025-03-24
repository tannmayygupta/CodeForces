import java.util.Scanner;

public class D1WayTooLongWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        for(int i = 0 ; i < n ; i++){
            words[i] = sc.nextLine();
        }

        for(int i = 0 ; i < n ; i++){
            // System.out.println(words[i]);

            if(words[i].length() > 10){
                char frst = words[i].charAt(0);
                char last = words[i].charAt(words[i].length()- 1 );
                int j = words[i].length() - 2 ;
                System.out.println(frst+""+j+""+last);
            }
            else{
                System.out.println(words[i]);
            }
        }

        

    }
}