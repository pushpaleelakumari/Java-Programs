import java.util.*;

public class LargestElementInArray {
    public static int BigOfArray(int arr[], int n) {
        int big = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        return big;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(BigOfArray(arr, n));
    }
}
