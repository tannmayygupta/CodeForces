import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                int abs = Math.abs(arr[i]);
                if (abs < min) {
                    min = abs;
                }
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
