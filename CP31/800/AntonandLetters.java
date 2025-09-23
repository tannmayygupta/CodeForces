import java.util.Scanner;
// A. Anton and Letters
// https://codeforces.com/contest/1476/problem/A

public class AntonandLetters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = s.length();

        int count = 0 ;

        int[] freq = new int[26];

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);

            int c = ch -'a' ;

            if(c >= 0 && c <= 25){
                freq[c]++;
            }
        }

        for(int i = 0 ; i < 26 ; i++){
            if(freq[i] > 0){
                count++;
            }
        }

        System.out.println(count);
    }
}
