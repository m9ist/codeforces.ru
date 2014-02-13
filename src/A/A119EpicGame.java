package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/119/A
 */
public class A119EpicGame {
    public static void main(final String args[]) throws IOException {
        final Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        int n = sc.nextInt();
        /*final int a = 3;
        final int b = 5;
        int n = 9;*/
        int player = 0;
        while (true) {
            final int s = (player == 0) ? gcd(a, n) : gcd(b, n);
            player = (player + 1) % 2;
            if (s > n) break;
            n -= s;
        }
        System.out.print(player);
    }

    private static int gcd(final int a1, final int a2) {
        if (a1 == 0 && a2 == 0) throw new RuntimeException();
        if (a1 == 0) return a2;
        if (a2 == 0) return a1;
        int max = 1;
        for (int i = 2; i <= Math.min(a1, a2); i++) {
            if ((a1 % i == 0) && (a2 % i == 0)) max = i;
        }
        return max;
    }
}
