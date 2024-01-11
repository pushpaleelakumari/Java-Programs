import java.util.*;
// integer is bigger
// character is smaller

public class EvenIndexUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - ('a' - 'A'));
                }
                res += ch;
            } else {
                char ch = str.charAt(i);
                res += ch;
            }
        }
        System.out.println(res);

    }
}
