// package contest.1062DIv4;

import java.util.Arrays;
import java.util.Scanner;

public class IsamatdinandHisMagicWand {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t--!= 0){
            
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            // swap wala logic gives TLE

            int Even = 0 ;
            int Odd =  0; 

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] % 2 == 0) {
                    Even = 1;
                }
                else{
                    Odd = 1;
                }
            }
            
            if(Even == 1 && Odd == 1){
                Arrays.sort(arr);
            }

            for(int i = 0; i < n; i++){
                System.out.print(arr[i]);
                if(i < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
}
