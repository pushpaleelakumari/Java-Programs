// package basics;

import java.util.*;

public class ContinousSumOfAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = ((a + b) * (b - a + 1));
        System.out.println(res);
    }
}
