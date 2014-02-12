package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/50/A
 */
public class A50DominoLaying {
    public static void main(final String args[]) throws IOException {
        final Scanner sc = new Scanner(System.in);
        final int m = sc.nextInt();
        final int n = sc.nextInt();
        if (m < 1 && n < 1) return;
        if (m == 1 && n == 1) {
            System.out.print(0);
            return;
        }
        System.out.print(n * m / 2);
    }
}
