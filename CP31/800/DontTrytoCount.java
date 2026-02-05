import java.util.Scanner;

public class DontTrytoCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        // 12
        // 1 5
        // a
        // aaaaa
        // 5 5
        // eforc
        // force
        // 2 5
        // ab
        // ababa
        // 3 5
        // aba
        // ababa
        // 4 3
        // babb
        // bbb
        // 5 1
        // aaaaa
        // a
        // 4 2
        // aabb
        // ba
        // 2 8
        // bk
        // kbkbkbkb
        // 12 2
        // fjdgmujlcont
        // tf
        // 2 2
        // aa
        // aa
        // 3 5
        // abb
        // babba
        // 1 19
        // m
        // mmmmmmmmmmmmmmmmmmm

        while (t--!=0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String x = sc.next();
            String s = sc.next();

            int cou = 0 ;
            boolean found = false ;
            StringBuilder xtendX = new StringBuilder(x);
            
            while (cou < 6 ) {

                if(xtendX.toString().contains(s)){
                    // stringbuilder me contains nhi hota toh hum stringbuilder 
                    // se string karke ussme contaisn check karte hai
                    found = true ;
                    break;
                }
                cou++;
                xtendX.append(xtendX);
            }

            if(found){
                System.out.println(cou);
            }else{
                System.out.println("-1");
            }
        }
    }
}
