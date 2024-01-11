import java.util.*;

public class FunCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1000; i++) {
            for (int j = -100; j < 100; j++) {
                System.out.print((char) (j)+"  ");
            }
            System.out.println();
        }
    }
}
