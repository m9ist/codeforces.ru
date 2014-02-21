package B;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/266/B
 */
public class B266QueueInSchool {
    public static void main(final String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int t = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        for (int j = 0; j < t; j++) {
            final StringBuilder sb = new StringBuilder();
            boolean skipNext = false;
            for (int i = 0; i < s.length() - 1; i++) {
                final String c = s.substring(i, i + 1);
                if (skipNext) {
                    skipNext = false;
                    continue;
                }
                final String nc = s.substring(i + 1, i + 2);
                if ("B".equals(c) && "G".equals(nc)) {
                    sb.append("G").append("B");
                    skipNext = true;
                } else {
                    sb.append(c);
                }
            }
            if (!skipNext) sb.append(s.substring(s.length() - 1));
            s = sb.toString();
        }
        System.out.print(s);
    }
}
