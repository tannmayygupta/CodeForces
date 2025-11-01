// package contest.1062DIv4;

import java.util.*;

public class Third {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
        
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            long ans = -1;
        
            boolean[] isMul = new boolean[100001];
            
            for(long x = 2; x <= 100000; x++) {
                if (isMul[(int)x]) {
                    continue;
                }

                boolean ans1 = false;

                for (int i = 0; i < n; i++) {
                    if (gcd(a[i], x) == 1) {
                        ans1 = true;
                        break;
                    }
                }
                
                if (ans1) {
                    ans = x;
                    break;
                } else {
                    for (long mul = x; mul <= 100000; mul += x) {
                        isMul[(int)mul] = true;
                    }
                }
            }
            
            System.out.println(ans);
        }
    }

    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
