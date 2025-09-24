import java.util.Scanner;

public class ArrivaloftheGeneral {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int min = Integer.MAX_VALUE ;
        int minidx = 0 ;

        int max = Integer.MIN_VALUE ;
        int maxidx = 0 ;

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();

            if(arr[i] <= min){
                min = arr[i];
                minidx = i ;
            }

            if(arr[i] > max){
                max = arr[i];
                maxidx = i ;
            }
        }

        // System.out.println(minidx+" "+min);
        // System.out.println(maxidx+" "+max);

        
        int mincorrect = (arr.length - 1) - minidx ;
        int maxcorrect = maxidx - 0 ;
        
        int ans = 0 ;

        if(minidx < maxidx){
            ans = mincorrect + maxcorrect - 1 ;    
            System.out.println(ans);        
        }
        else if(minidx > maxidx){
            ans = mincorrect + maxcorrect ;
            System.out.println(ans);
        }
        else{
            System.out.println(ans);
        }
        
    }
}
