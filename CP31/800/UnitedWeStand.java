import java.util.ArrayList;
import java.util.Scanner;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {

            int n = sc.nextInt();

            long[] arr = new long[n];

            long max = Long.MIN_VALUE;

            long min = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                if (min > arr[i]) {
                    min = arr[i];
                }

                if (max < arr[i]) {
                    max = arr[i];
                }
            }

            if (min != max) {

                ArrayList<Long> c = new ArrayList<>();

                ArrayList<Long> b = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    if (max > arr[i]) {
                        b.add(arr[i]);
                    } else {
                        c.add(arr[i]);
                    }
                }

                System.out.println(b.size() + " " + c.size());

                for (int i = 0; i < b.size(); i++) {
                    System.out.print(b.get(i)+" ");
                }
                System.out.println();

                for (int i = 0; i < c.size(); i++) {
                    System.out.print(c.get(i)+" ");
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }

        }
    }
}
