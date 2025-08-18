import java.util.Scanner;
// B. Following Directions
// https://codeforces.com/contest/1791/problem/B

public class FollowingDirections {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t != 0) {

            int N = sc.nextInt();

            String s = sc.next();

            int x = 0 ;

            int y = 0 ;

            int flag = 0 ;

            for(int i = 0 ; i < N ; i++){
                char ch = s.charAt(i);

                if(ch == 'R'){
                    x = x + 1 ;
                    if(check(x, y)){
                        flag = 1 ;
                        break;
                    }
                }
                else if(ch == 'L'){
                    x = x - 1 ;
                    if(check(x, y)){
                        flag = 1 ;
                        break;
                    }
                }
                else if(ch == 'U'){
                    y = y + 1 ;
                    if(check(x, y)){
                        flag = 1 ;
                        break;
                    }
                }
                else if(ch == 'D'){
                    y = y - 1 ;
                    if(check(x, y)){
                        flag = 1 ;
                        break;
                    }
                }
            }

            if(flag == 1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
            t--;
        }

    }

    static boolean check(int x , int y){
        
        if(x == 1 && y == 1){
            return true ;
        }
        
        return false ;
    }
}
