package A;

import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/148/A
 */
public class A148InsomniaCure {
    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        final int k = sc.nextInt();
        final int l = sc.nextInt();
        final int m = sc.nextInt();
        final int n = sc.nextInt();
        final int d = sc.nextInt();
        if (k == 1 || l == 1 || m == 1 || n == 1) {
            System.out.print(d);
            return;
        }
        int res = 0;
        res += d / k;
        res += d / l - d / mds(k, l);
        res += d / m - d / mds(k, m) - d / mds(l, m) + d / mds(k, l, m);
        res += d / n
                - d / mds(k, n) - d / mds(l, n) - d / mds(m, n)
                + d / mds(k, l, n) + d / mds(k, m, n) + d / mds(l, m, n)
                - d / mds(k, l, m, n);
        System.out.print(res);
    }

    private static int mds(final int... a) {
        int i = 1;
        while (true) {
            boolean is = false;
            for (final int ai : a) {
                if (i % ai > 0) {
                    is = true;
                    break;
                }
            }
            if (!is) break;
            i++;
        }
        return i;
    }
}
