import java.util.HashMap;
import java.util.Scanner;
// https://codeforces.com/contest/977/problem/B
// B. Two-gram
public class Twogram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        String s = sc.next();

        HashMap<String, Integer> ans = new HashMap<>();

        for(int i = 0 ; i < N - 1 ; i++){
            String s1 = s.substring(i, i+2);

            if(ans.containsKey(s1)){
                int val = ans.get(s1);
                ans.put(s1,val+1);
            }
            else{
                ans.put(s1,1);
            }

        }

        int max = Integer.MIN_VALUE ;

        for(int i = 0; i < N - 1 ; i++){
            String s2 = s.substring(i, i+2);
            max = Math.max(max,ans.get(s2));
        }

        int ind = -1 ;

        for(int i = 0; i < N - 1 ; i++){
            String s2 = s.substring(i, i+2);
            
            if(ans.get(s2) == max){
                ind = i ;
                break ;
            }

        }

        System.out.println(s.substring(ind, ind+2));

    }
}