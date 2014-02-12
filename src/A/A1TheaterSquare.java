package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/1/A
 */
public class A1TheaterSquare {
    public static void main(final String args[]) throws IOException {
        long n = -1, m = -1, a = -1;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            final long s = sc.nextLong();
            if (a == -1 && m > 0) a = s;
            if (m == -1 && n > 0) m = s;
            if (n == -1) n = s;
        }
        if (a <= 0 || n <= 0 || m <= 0) return;

        final long horAm = n / a + ((n % a) > 0 ? 1 : 0);
        final long verAm = m / a + ((m % a) > 0 ? 1 : 0);

        final long res = horAm * verAm;
        System.out.print(res);
    }
}
