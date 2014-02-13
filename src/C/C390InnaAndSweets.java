package C;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/390/C
 */
public class C390InnaAndSweets {
    public static void main(final String args[]) throws IOException {
        final long t1 = System.currentTimeMillis();
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int k = sc.nextInt();
        final int w = sc.nextInt();
        sc.nextLine();
        final String word = sc.nextLine();
        if (word.length() != n) return;
        final int[] hasSweets = new int[n];
        for (int i = 0; i < n; i++)
            hasSweets[i] = word.substring(i, i + 1).equals("1") ? 1 : 0;
        int lastCount = 0, lastL = 0, lastR = 0;
        for (int i = 0; i < w; i++) {
            final int l = sc.nextInt();
            final int r = sc.nextInt();
            if (l == lastL && r == lastR) {
                System.out.println(lastCount);
                continue;
            }
            int count = 0;
            int nextQ = l - 1 + k;
            if (k == 1) {
                for (int j = l; j <= r; j++) {
                    count += 1 - hasSweets[j-1];
                }
            } else {
                for (int j = l; j <= r; j++) {
                    if (j == nextQ) {
                        count += 1 - hasSweets[j-1];
                        nextQ += k;
                    } else {
                        count += hasSweets[j-1];
                    }
                }
            }
            lastCount = count;
            lastL = l;
            lastR = r;
            System.out.println(count);
        }
        final long t2 = System.currentTimeMillis();
        //System.out.println("Spend " + (t2 -t1) + "ms");
        /*System.out.println("100000 1 100000");
        for (int i = 0; i < 100000; i++)
            System.out.print(0);
        System.out.println();
        for (int i = 0; i < 100000; i++) {
            System.out.println("1 100000");
        }*/
    }
}
