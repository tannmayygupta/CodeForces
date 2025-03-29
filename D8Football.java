import java.util.*;

public class D8Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        sc.nextLine();

        String[] st = new String[n];

        for(int i = 0 ; i < n ; i++){
            st[i] = sc.nextLine();
        }

        String s1 = st[0];

        String s2 = "";

        for (int i = 1; i < n; i++) {
            if (!s1.equals(st[i])) {
                s2 = st[i];
                break;
            }
        }

        // System.out.println(s1);
        // System.out.println(s2);

        int count1 = 0 ;
        int count2 = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(s1.equals(st[i])){
                count1++;
            }
            else if(s2.equals(st[i])){
                count2++;
            }
        }

        if(count1 > count2){
            System.out.println(s1);
        }
        else{
            System.out.println(s2);
        }

    }
}
