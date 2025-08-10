import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class DoremysPaint3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t!= 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            HashMap<Integer,Integer> cou = new HashMap<>();
            
            for(int i = 0 ; i < n ; i++){
                if(cou.containsKey(arr[i])){
                    int val = cou.get(arr[i]);
                    cou.put(arr[i],val+1);
                }
                else{
                    cou.put(arr[i],1);
                }
            }

            if(cou.size() >= 3){
                System.out.println("No");
            }
            else if(cou.size() == 1 ){
                System.out.println("Yes");
            }
            else{
                Iterator<Integer> it = cou.values().iterator();
                int freq1 = it.next();
                int freq2 = it.next();

                if(n % 2 == 1 && Math.abs(freq2-freq1) == 1){
                    System.out.println("Yes");
                }
                else if(freq1 == freq2){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }

            t--;
        }
    }
}
