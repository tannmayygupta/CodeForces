import java.util.Scanner;
// D. Not a Cheap String
// https://codeforces.com/contest/1702/problem/D

public class NotaCheapString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t-- > 0){
            
            String s = sc.next();
            
            int p = sc.nextInt();

            int[] freq = new int[26];

            int sum = 0 ; // price

            for(int i = 0 ; i < s.length() ; i++){

                char ch = s.charAt(i);

                int c = ch - 'a' ;

                sum = sum + ( c + 1) ;

                freq[c]++;
            }


            if(sum <= p){
                System.out.println(s);
                continue;
            }

            // we are starting with the z so that we remove the char with max value
            for(int i = 25 ; i >= 0 && sum > p; i--){
                
                while (freq[i] > 0 && sum > p) {
                    
                    sum = sum - ( i + 1 );
                    
                    freq[i]--;

                    // i = freq.length - 1 ;

                }

            }

            StringBuilder ans = new StringBuilder() ;

            for(int j = 0 ; j < s.length() ; j++){
                char ch = s.charAt(j);

                int c = ch - 'a';

                if(freq[c] > 0){
                    ans.append(ch);
                    freq[c]--;
                }
            }

            System.out.println(ans.toString());
            
        }
    }
}
