package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/231/A
 */
public class A231Team {
    public static void main(final String args[]) throws IOException {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            final int a1 = sc.nextInt();
            final int a2 = sc.nextInt();
            final int a3 = sc.nextInt();
            if (a1 + a2 + a3 >= 2) count++;
        }
        System.out.print(count);
    }
}
