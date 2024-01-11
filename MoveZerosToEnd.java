import java.util.*;

public class MoveZerosToEnd {
    public static void BrootForceMethod(int a[], int n) {
        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            temp[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                temp[j] = a[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BrootForceMethod(arr, n);
    }
}
