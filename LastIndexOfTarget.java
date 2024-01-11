import java.util.*;

public class LastIndexOfTarget {

    public static int LastIndexOfTarget(int arr[], int target) {
        for (int i = arr.length - 1; i > -1; i--) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(LastIndexOfTarget(arr, target));
    }
}
