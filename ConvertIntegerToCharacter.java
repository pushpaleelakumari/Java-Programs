import java.util.*;

public class ConvertIntegerToCharacter {
    public static char ConvertCharacter(int ascii) {
        return (char) (ascii);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ascii = sc.nextInt();
        System.out.println(ConvertCharacter(ascii));
    }
}
