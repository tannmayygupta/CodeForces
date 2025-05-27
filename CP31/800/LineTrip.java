import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t!=0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n + 2];

            arr[0] = 0 ;

            for(int i = 1 ; i <= n ; i++){
                arr[i] = sc.nextInt();
            }

            arr[n+1] = x ;


            int minvol = Integer.MIN_VALUE ;

                for(int j = 0 ; j <= n  ; j++){
                    int diff = arr[j+1] - arr[j] ;
                    if(j == n){
                        diff = diff * 2 ;   
                    }
                    minvol = Math.max(minvol , diff);
                }

                System.out.println(minvol);

            t--;
        }
    }
}
