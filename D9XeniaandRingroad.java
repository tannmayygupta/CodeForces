import java.util.*;

public class D9XeniaandRingroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[m];

        long count = 0 ;

        int xeniaInitially = 1 ;

        for(int i = 0 ; i < m ;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < m ; i++){
            if(arr[i] >= xeniaInitially){
                count += arr[i] - xeniaInitially;
            }
            else{
                count += n - xeniaInitially + arr[i] ; 
            }
            xeniaInitially = arr[i];
        }

        System.out.println(count);
    
    }
}
