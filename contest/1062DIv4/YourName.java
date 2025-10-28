// package contest.1062DIv4;

import java.util.Scanner;

public class YourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();

            String s = sc.next();

            String ta = sc.next();

            int[] freq = new int[26];

            for(int i = 0 ; i < n ; i++){
                char ch = s.charAt(i);
                int c = ch - 'a' ;

                freq[c]++;

                char check = ta.charAt(i);
                int check1 = check - 'a';

                freq[check1]--;
            }

            int flag = 0 ;

            for(int i = 0 ; i < 26 ; i++){
                if(freq[i] != 0){
                    flag = 1 ;
                    break ;
                }
            }

            if(flag == 1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

        }
    }
}
