import java.util.*;

public class D12BlackandWhiteStripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();

            String s = sc.nextLine();

            if (k == 1 && s.contains("B")) {
                System.out.println(0);
                t--;
                continue;
            }

            int minc = k ;

            for(int i = 0 ; i <= n - k ; i++){
                int wtc = 0 ;
                for(int j = i ; j < i + k ; j++){
                    if(s.charAt(j) == 'W'){
                        wtc++;
                    }
                }
                minc = Math.min(minc , wtc);
                
                if (wtc == 0) {
                    break;
                }
            }

            System.out.println(minc);
            
            t--;
        }
    }
}
