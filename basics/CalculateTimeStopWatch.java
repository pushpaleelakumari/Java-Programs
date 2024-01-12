package basics;

import java.util.*;

public class CalculateTimeStopWatch {
    public static int FindTheTime(int arr[]) {
        int res = 0;
        if (arr.length % 2 != 0) {
            return -1;
        }
        for (int i = 0; i < arr.length - 1; i += 2) {
            res += arr[i + 1] - arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(FindTheTime(arr));
    }
}
