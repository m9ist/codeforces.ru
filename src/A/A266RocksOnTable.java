package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/266/A
 */
public class A266RocksOnTable {
    public static void main(final String args[]) throws IOException {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        sc.nextLine();
        if (n < 0) return;
        if (n == 0) {
            System.out.print(0);
            return;
        }
        final String line = sc.nextLine();
        if (line.length() < n) return;
        String prev = "";
        int count = 0;
        for (int i = 0; i < n; i++) {
            final String c = line.substring(i, i + 1);
            if (prev.equals(c)) count++;
            prev = c;
        }
        System.out.print(count);
    }
}
