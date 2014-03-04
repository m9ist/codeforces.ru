package B;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/257/B
 */
public class B257GameCubes {
    public static void main(final String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int tmp = Math.min(n, m);
        m = Math.max(n, m);
        n = tmp;
        if (n % 2 == 0) {
            System.out.print((m - 1) + " " + n);
        } else {
            System.out.print(m - 1 + " " + n);
        }
    }
}
