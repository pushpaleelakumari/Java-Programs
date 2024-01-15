// package basics;

import java.util.*;

public class FindMissingElement {
    public static int FindMissingNumber(int arr[]) {
        int res = 1;
        int temp = res;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == res) {
                    System.out.println("hello find");
                    temp = res;
                    res++;
                }
            }
            if (temp == res) {
                System.err.println("hello return");
                return res;
            }
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
        System.out.println(FindMissingNumber(arr));
    }
}
