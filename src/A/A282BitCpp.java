package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/282/A
 */
public class A282BitCpp {
    public static void main(final String args[]) throws IOException {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        sc.nextLine();
        int x = 0;
        for (int i = 0; i < n; i++) {
            final String s = sc.nextLine();
            if ("-".equals(s.substring(1, 2))) x--; else x++;
        }
        System.out.print(x);
    }
}
