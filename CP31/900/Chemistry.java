import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            int n = sc.nextInt();
            
            int k = sc.nextInt();

            String s = sc.next();

            int[] fre = new int[26];

            for(int i = 0 ; i < s.length() ; i++){
                char ch = s.charAt(i);

                int c = ch - 'a' ;

                fre[c]++;
            }

            int cou = 0 ;

            for(int i = 0 ; i < 26 ; i++){
                if(fre[i] % 2 != 0){
                    cou++;
                }
            }

            if(cou > k + 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
