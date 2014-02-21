package B;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/200/B
 */
public class B200Drinks {
    public static void main(final String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            final int s = sc.nextInt();
            sum += s;
        }
        System.out.print(1.0 * sum / n);
    }
}
