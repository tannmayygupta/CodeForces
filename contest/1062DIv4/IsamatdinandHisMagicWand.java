// package contest.1062DIv4;

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

            for(int i = 0 ; i < n; i++){
                for(int j = i + 1 ; j < n ; j++){

                    if( ( (arr[i] % 2) != (arr[j] % 2) ) && arr[i] > arr[j]){
                        // swap ;
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp ; 
                    }

                }
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
