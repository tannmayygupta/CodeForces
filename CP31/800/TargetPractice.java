import java.util.Scanner;

// A. Target Practice
// https://codeforces.com/problemset/problem/1873/C

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){
            
            int[][] ring = {{1,1,1,1,1,1,1,1,1,1},
                            {1,2,2,2,2,2,2,2,2,1},
                            {1,2,3,3,3,3,3,3,2,1},
                            {1,2,3,4,4,4,4,3,2,1},
                            {1,2,3,4,5,5,4,3,2,1},
                            {1,2,3,4,5,5,4,3,2,1},
                            {1,2,3,4,4,4,4,3,2,1},
                            {1,2,3,3,3,3,3,3,2,1},
                            {1,2,2,2,2,2,2,2,2,1},
                            {1,1,1,1,1,1,1,1,1,1} 
                        };

            char[][] quering = new char[10][10];

            int ans = 0 ;

            for(int i = 0 ; i < 10 ; i++){
                String row = sc.next();
                for(int j = 0 ; j < 10 ; j++){
                    quering[i][j] = row.charAt(j);

                    if(quering[i][j] == 'X'){
                        ans += ring[i][j];
                    }
                }
            }

            System.out.println(ans);

        }
    }
}
