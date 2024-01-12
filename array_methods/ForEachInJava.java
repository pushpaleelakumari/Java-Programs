package array_methods;

import java.util.*;

public class ForEachInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] res = str.split(" ");
        for (String ans : res) {
            System.out.println(ans);
        }
    }
}
