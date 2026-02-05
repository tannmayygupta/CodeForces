import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        // B. Blank Space
        // https://codeforces.com/problemset/problem/1829/B
        while (t--!=0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            int max = Integer.MIN_VALUE ;
            int cou = 0 ;

            // 1 0 0 1 0 
            for(int i = 0 ; i < n ; i++){
                if(arr[i] == 1){
                    max = Math.max(max, cou);
                    cou = 0 ;
                }else{
                    cou++;
                }
            }

            max = Math.max(max, cou);


            System.out.println(max);
        }

    }
}
