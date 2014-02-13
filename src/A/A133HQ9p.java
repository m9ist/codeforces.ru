package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/133/A
 */
public class A133HQ9p {
    public static void main(final String args[]) throws IOException {
        final Scanner sc = new Scanner(System.in);
        while (true) {
            final String word = sc.next();
            if (word.length() == 0) continue;
            for (int i = 0; i < word.length(); i++) {
                final String c = word.substring(i, i + 1);
                if ("H".equals(c)
                        || "Q".equals(c)
                        || "9".equals(c)) {
                    System.out.print("YES");
                    return;
                }
            }
            System.out.print("NO");
            return;
        }
    }
}
