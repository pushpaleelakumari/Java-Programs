import java.util.*;

public class SecondSmallAndLarge {

    public static int SecondLargest(int a[], int n) {
        int big = Integer.MIN_VALUE;
        int secondBig = Integer.MIN_VALUE;
        if (n < 2)
            return -1;
        for (int i = 0; i < n; i++) {
            if (big < a[i]) {
                secondBig = big;
                big = a[i];
            } else if (a[i] > secondBig && a[i] != big) {
                secondBig = a[i];
            }
        }
        return secondBig;
    }

    public static int SecondSmallest(int a[], int n) {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        if (n < 2)
            return -1;
        for (int i = 0; i < n; i++) {
            if (small > a[i]) {
                secondSmall = small;
                small = a[i];
            } else if (a[i] < secondSmall && a[i] != small) {
                secondSmall = a[i];
            }
        }
        return secondSmall;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(SecondLargest(arr, n));
        System.out.println(SecondSmallest(arr, n));
    }
}
