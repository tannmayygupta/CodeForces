import java.util.Scanner;

public class ArrayColoring {
    // A. Array Coloring
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t--!=0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }

            // count even
            // count odd 

            // odd is even and even in odd or even (doest matter) yes for this test ca
            // odd is odd (sum odd) even ka doesnt matter for this test NO 
            int countEven =  0 ;
            int countOdd =  0 ;
            for(int i = 0 ; i < n ; i++){
                if(arr[i] % 2 == 0){
                    countEven++;
                }else{
                    countOdd++;
                }
            }

            // both count even then yes 
            // both count odd the 
            // odd count is even and even count odd yes 
            // if odd count is odd and its even count even even  yes 
            // countOdd % 2 != 0 && countEven != 0 // if we give one odd to even count to make sum odd but odd sum becom even
            // 
            if(countOdd % 2 != 0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
