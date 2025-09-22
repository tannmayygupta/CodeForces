import java.util.Scanner;

public class ChallengingValleys {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        // whats happing while we increment one pointer with respect to the other
        // so when we do r < n - 1 this may skip last segment
        // so here is good approach for incrementing depended pointer ;

        while(t-- > 0){

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt() ;
            }

            int l = 0 ; 

            int r = 0 ;


            int flag = 0 ;

            while(l < n && r < n - 1){
                if(arr[r] == arr[r+1]){
                    r++;
                }
                else if(arr[r] != arr[r+1]){
                    
                    if((l == 0) && (r < n - 1) && (arr[r] < arr[r+1])){
                        flag = 1 ;
                    }
                    else if( (l > 0) && (arr[l] > arr[l-1]) && (r < n-1) && (arr[r] < arr[r+1])){
                        flag += 1 ;
                    }
                    else if((l > 0) && (r == n - 1) && (arr[l] > arr[l-1]) ){
                        flag += 1 ;
                    }

                    l = r + 1 ;
                    r++;
                    // now l and r at same pos
                }
            }

            if(l == 0 && r == n - 1){
                System.out.println("YES");
            }else if(flag > 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }


        // method for depended pointer

        // Scanner sc = new Scanner(System.in);

        // int t = sc.nextInt();
        
        // while(t-- > 0){

        //     int n = sc.nextInt();

        //     int[] arr = new int[n];

        //     for(int i = 0 ; i < n ; i++){
        //         arr[i] = sc.nextInt() ;
        //     }

        //     int l = 0 ; 


        //     int flag = 0 ;

        //     while(l < n ){

        //         int r = l ;

        //         while(r < n - 1 && arr[r] == arr[r+1]){
        //             r++;
        //         }


        //         // this complicates the comparison 

        //         // if(l == 0 && arr[r] < arr[r+1]){
        //         //     flag += 1 ;
        //         // }
        //         // else if(l > 0 && arr[l] > arr[l-1] && r!= n - 1 && arr[r] < arr[r+1]){
        //         //     flag +=1;
        //         // }
        //         // else{
        //         //     if(l > 0 && arr[])
        //         // }


        //         // easy way to check is

        //         boolean left =  (l == 0) || (arr[l] < arr[l - 1]) ;
                
        //         boolean right = (r == n - 1) || (arr[r] < arr[r+1]) ;
                    

        //         if(left && right){
        //             flag += 1;
        //         }

        //         l = r + 1 ;
        //     }

        //     if(flag == 1){
        //         System.out.println("YES");
        //     }else{
        //         System.out.println("NO");
        //     }
        // }

    }
}
