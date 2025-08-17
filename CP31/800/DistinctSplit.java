import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DistinctSplit {
    // D. Distinct Split
    // https://codeforces.com/contest/1791/problem/D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t!=0){
            int n = sc.nextInt();
            String s = sc.next() ;

            // HashMap<String,Integer> ans = new HashMap<>();

            boolean[] arr = new boolean[26];

            int ans = 0 ;

            int idx = 0 ;

            int flag = 0 ;

            for(int i = 0 ; i < n ; i++){
                char ch = s.charAt(i);
                int c = ch - 'a' ;

                if(arr[c] == true){
                    idx = i ;
                    flag = 1 ;
                    break ;
                }

                if(arr[c] == false){
                    arr[c] = true ;
                    ans++;
                }
            }

            if(flag == 1){
                Arrays.fill(arr,false);

                for(int i = idx ; i < n ; i++){
                    char ch = s.charAt(i);
                    int c = ch - 'a' ;

                    if(arr[c] == false){
                        arr[c] = true ;
                        ans++;
                    }

                }
            }

            System.out.println(ans);

            t--;
        }
    }
}
