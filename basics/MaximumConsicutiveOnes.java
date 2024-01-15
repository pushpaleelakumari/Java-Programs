// package basics;

import java.util.*;

public class MaximumConsicutiveOnes {
    public static int FindMaxConsicutiveOnes(int arr[]) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }
            if (i == arr.length - 1) {
                if (max < count) {
                    max = count;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(FindMaxConsicutiveOnes(arr));
    }

}
