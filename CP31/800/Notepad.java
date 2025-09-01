import java.util.HashSet;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            String s = sc.next();
            
            HashSet<String> set = new HashSet<>();

            int flag = 0 ;

            if(n == 1){
                System.out.println("NO");
                // t--; // no need to decrement
                continue;
            }

            for(int i = 0 ; i < n ; i++){
                for(int j = i ; j < n ; j++){
                    String s1 = s.substring(i,j+1);
                    if(set.contains(s1)){
                        if(s1.length() > 1){
                            flag = 1 ;
                            break;
                        }
                    }
                    else{
                        set.add(s1);
                    }
                }
            }

            if(flag == 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
