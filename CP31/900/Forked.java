import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Forked {
    public static void main(String[] args) {
        // A. Forked!
        // https://codeforces.com/problemset/problem/1904/A

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {

            long xk = sc.nextLong();
            long yk = sc.nextLong();

            long xq = sc.nextLong();
            long yq = sc.nextLong();

            long a = sc.nextLong();
            long b = sc.nextLong();

            long dx[] = {-1,-1,1,1};
            long dy[] = {-1,1,-1,1};


            HashSet<Map.Entry<Long , Long> > kingset = new HashSet<>() ;

            HashSet<Map.Entry<Long , Long> > Queenset = new HashSet<>() ;



            for(int i = 0 ; i < 4 ; i++){
                kingset.add(new AbstractMap.SimpleImmutableEntry<>(  (xk + dx[i] * a)  , (yk + dy[i] * b) )) ;
                kingset.add(new AbstractMap.SimpleImmutableEntry<>(  (xk + dx[i] * b)  ,  ( yk + dy[i] * a) )) ;


                Queenset.add(new AbstractMap.SimpleImmutableEntry<>(  (xq + dx[i] * a)  ,   (yq + dy[i] * b) ));
                Queenset.add(new AbstractMap.SimpleImmutableEntry<>(  (xq + dx[i] * b)  ,   (yq + dy[i] * a) ));

            }

            int ans = 0 ;

            for(Map.Entry<Long , Long> pos : kingset){
                if(Queenset.contains(pos)){
                    ans++;
                }
            }

            System.out.println(ans);

        }
    }
}
