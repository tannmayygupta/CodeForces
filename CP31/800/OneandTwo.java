import java.util.Scanner;

public class OneandTwo {
    //  A. One and Two
    // https://codeforces.com/problemset/problem/1788/A

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int cou2 = 0 ; 
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt() ;
                if(arr[i] == 2){
                    cou2++;
                }
            }

            int cur2 = 0 ;
            
            // 6
            // 2 2 1 2 1 2 
            // 4 0
            // 3
            // 1 2 1
            // 4
            // 1 1 1 1
            int flag = 0 ;
            int ind = -1 ;
            for(int i = 0 ; i < n ; i++){
                
                if(arr[i] == 2){
                    cou2-- ;
                    cur2++;
                }
                if(cur2 == cou2){
                    flag = 1 ;
                    ind = i ;
                    break ;
                }
            }

            if(flag == 1){
                System.out.println(ind+1);
            }else{
                System.out.println(ind);
            }
        }

    }
}
