import java.util.Scanner;
// A. Make it Beautiful
// https://codeforces.com/problemset/problem/1783/A
public class MakeitBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            int min = Integer.MAX_VALUE ;
            int max = Integer.MIN_VALUE ;
            int mxind = -1 ;

            for(int i = 0 ; i < n ; i++){
                if(min > arr[i]){
                    min = arr[i];
                    
                }

                if(max < arr[i]){
                    max = arr[i];
                    mxind = i ;
                }
            }

            if(min == max){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                System.out.print(max+" ");
                for(int i = 0 ; i < n ; i++){
                    if(i == mxind){
                        continue ;
                    }
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
