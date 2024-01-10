import java.util.*;

public class Patterns {
    public static void RightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void PascalRightAngleTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k * (i - j) / j;
            }
            System.out.println();
        }
    }

    public static void SquarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void NumberRightAngle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void UniqueNumberRightAngle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void ReverseRightAngle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void NormalTriangle(int n) {
        int base = 2 * (n - 1) + 1;
        for (int i = 1; i < n; i++) {
            int k = ((2 * i) + 1) / 2;
            for (int j = 0; j < base; j++) {
                
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RightTriangle(n);
        System.out.println();

        PascalRightAngleTriangle(n);
        System.out.println();

        SquarePattern(n);
        System.out.println();

        NumberRightAngle(n);
        System.out.println();

        UniqueNumberRightAngle(n);
        System.out.println();

        ReverseRightAngle(n);
        System.out.println();

        NormalTriangle(n);
        System.out.println();
    }
}
