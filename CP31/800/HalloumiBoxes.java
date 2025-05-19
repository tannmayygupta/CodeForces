import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t!=0){

            int n = sc.nextInt();

            int k = sc.nextInt();

            int a[] = new int[n];

            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
            }

            boolean isSorted = Sorted(a);

            if(isSorted){
                System.out.println("YES");
            }
            else if (k <= 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            
            t--;
        }
    }
    public static boolean Sorted(int[] a){
        
        for(int i = 0 ; i < a.length - 1; i++){
            if(a[i] > a[i+1]){
                return false ;
            }
        }

        return true ;
    }
}
