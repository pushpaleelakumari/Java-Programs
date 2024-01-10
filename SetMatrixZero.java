import java.util.*;

public class SetMatrixZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int a[][] = new int[i][j];
        boolean checkRow[] = new boolean[i];
        boolean checkCol[] = new boolean[j];
        for (int row = 0; row < i; row++) {
            for (int col = 0; col < j; col++) {
                a[row][col] = sc.nextInt();
            }
        }
        for (int row = 0; row < i; row++) {
            for (int col = 0; col < j; col++) {
                if (a[row][col] == 0) {
                    checkRow[row] = true;
                    checkCol[col] = true;
                }
            }
        }
        for (int row = 0; row < i; row++) {
            for (int col = 0; col < j; col++) {
                if (checkRow[row] == true || checkCol[col] == true) {
                    a[row][col] = 0;
                }
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }
}