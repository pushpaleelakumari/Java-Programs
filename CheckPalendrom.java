import java.util.*;

public class CheckPalendrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println(rev);
        if (k == rev) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
