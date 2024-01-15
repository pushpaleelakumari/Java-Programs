import java.util.*;

public class TargetIndex {

    public static void PrintTargetIndexes(int a[], int target) {
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.print(i + " ");
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        PrintTargetIndexes(arr, target);
    }
}
