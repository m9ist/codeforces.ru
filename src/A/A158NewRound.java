package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/158/A
 */
public class A158NewRound {
    public static void main(final String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int k = sc.nextInt();
        if (n <= 0 || k <= 0 || n < k) return;

        int count = 0;
        int kpoint = -1;
        for (int i = 0; i < n; i++) {
            final int point = sc.nextInt();
            if (i == k - 1) kpoint = point;
            if ((point > 0 && kpoint < 0) || (kpoint >= 0 && point >= kpoint && point > 0)) count++;
            if (point <= 0) break;
        }
        System.out.print(count);
    }
}
