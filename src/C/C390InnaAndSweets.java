package C;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/390/C
 */
public class C390InnaAndSweets {
    public static void main(final String args[]) throws IOException {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int k = sc.nextInt();
        final int w = sc.nextInt();
        sc.nextLine();
        final String word = sc.nextLine();
        if (word.length() != n) return;
        final boolean[] hasSweets = new boolean[n];
        for (int i = 0; i < n; i++)
            hasSweets[i] = word.substring(i, i + 1).equals("1");
        for (int i = 0; i < w; i++) {
            final int l = sc.nextInt();
            final int r = sc.nextInt();
            int count = 0;
            int nextQ = l - 1 + k;
            if (k == 1) {
                for (int j = l; j <= r; j++) {
                    if (!hasSweets[j-1]) count++;
                }
            } else {
                for (int j = l; j <= r; j++) {
                    if (j == nextQ) {
                        if (!hasSweets[j - 1]) count++;
                        nextQ += k;
                    } else {
                        if (hasSweets[j - 1]) count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
