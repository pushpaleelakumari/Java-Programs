import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k = 1;
            for (int j = 1; j < i + 1; j++) {
                System.out.print(k + " ");
                k = (k * (i - j)) / j;
            }
            System.out.println();
        }
    }
}
