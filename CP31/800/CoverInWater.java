import java.util.* ;
// A. Cover in Water
// https://codeforces.com/problemset/problem/1900/A
public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--!=0){
            int n = sc.nextInt();
            String s = sc.next();
            int contiEmpty = 0 ; 
            int totalEmpty = 0 ;
            int max = 0 ;
            for(int i = 0 ; i < n ; i++){
                char ch = s.charAt(i);
                if(ch == '.'){
                    totalEmpty++;
                    contiEmpty++;
                    if(max < contiEmpty){
                        max = contiEmpty ;
                    }
                }else{
                    contiEmpty = 0 ;
                }
            }

            if(max >= 3){
                System.out.println(2);
            }else{
                System.out.println(totalEmpty);
            }
        }
    }
}
