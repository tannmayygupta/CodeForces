import java.util.*;

public class D2YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int arr[][] = new int[m][3];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < 3 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0 ;
        int count = 0 ;

        for(int i = 0 ; i < 3 ; i++){
            sum = 0 ;
            for(int j = 0 ; j < m ; j++){
                sum += arr[j][i];
            }
            if(sum == 0){
                count++;
            }
        }

        if(count == 3){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
