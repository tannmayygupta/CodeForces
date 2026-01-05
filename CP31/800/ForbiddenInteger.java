import java.util.Scanner;
// Forbidden Integer

// https://codeforces.com/problemset/problem/1845/A
public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0) {
            int n = sc.nextInt();

            int k = sc.nextInt();

            int x = sc.nextInt();
            
            if(x != 1){
                // if not one then we say that 
                System.out.println("YES");
                System.out.println(n);
                for(int i = 0 ; i < n ; i++){
                    System.out.print("1 ");
                }
                System.out.println();
            }else{
                // if x == 1 then the no should be even to be ans possible
                // and n we have to achive is odd then we say no
                
                if(k == 1){
                    System.out.println("NO");
                    // System.out.println();

                }else if(k==2){
                    // for k = 2 we only have to 
                    if(n % 2 == 0){
                        System.out.println("YES");
                        System.out.println(n/2);
                        for(int i = 0 ; i < n /2 ; i++){
                            System.out.print("2 ");
                        }
                    System.out.println();

                    }else{
                        System.out.println("NO");
                        // System.out.println();

                    }

                }else{
                    if(n%2 == 0){
                        System.out.println("YES");
                        System.out.println(n/2);
                        for(int i = 0 ; i < n /2 ; i++){
                            System.out.print("2 ");
                        } 
                        System.out.println();

                    }else{
                        System.out.println("YES");
                        System.out.println(n/2);
                        for(int i = 0 ; i < ( (n /2) - 1) ; i++){
                            System.out.print("2 ");
                        }
                        System.out.println("3");
                        // System.out.println();
                    }
                }
            }   
        }
    }
}
