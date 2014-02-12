package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/4/A
 */
public class A4Watermelon {
    public static void main(final String args[]) throws IOException {
        long w = -1;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            w = sc.nextInt();
        }
        if (w < 0) return;

        if (w < 4) System.out.print("NO");
        else {
            System.out.print((w % 2 == 0 ? "YES" : "NO"));
        }
    }
}
