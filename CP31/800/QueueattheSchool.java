import java.util.Arrays;
import java.util.Scanner;

public class QueueattheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int t = sc.nextInt();

        String s = sc.next();

        char[] c = s.toCharArray();

        while(t!=0){
            for(int i = 0 ; i < c.length - 1; i++){
                if(c[i] == 'B' && c[i+1] == 'G'){
                    char temp = c[i+1];
                    c[i+1]= c[i];
                    c[i] = temp ;
                    i++;
                }
            }
            t--;
        }

        // String s1 = Arrays.toString(c);

        String s1 = new String(c);


        System.out.println(s1);

    }
}
