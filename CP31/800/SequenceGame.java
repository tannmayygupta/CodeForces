import java.util.ArrayList;
import java.util.Scanner;

public class SequenceGame {
    // B. Sequence Game

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            
            int[] b = new int[n];

            for(int i = 0 ; i < n ; i++){
                b[i] = sc.nextInt() ;
            }

            ArrayList<Integer> ans = new ArrayList<>();
            // System.out.print(b[0]+" ");
            ans.add(b[0]);
            

            for(int i = 1 ; i < n ; i++){
                if(b[i - 1] <= b[i]){
                    // System.out.print(b[i]+" ");
                    ans.add(b[i]);
                }else{
                    // System.out.print(b[i]+" "+b[i]+" ");
                    ans.add(b[i]);
                    ans.add(b[i]);
                }
            }

            System.out.println(ans.size());
            
            // System.out.println(ans.toString());

            for(int i = 0; i < ans.size(); i++){
                System.out.print(ans.get(i));
                if(i < ans.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
