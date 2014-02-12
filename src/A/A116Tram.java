package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/116/A
 */
public class A116Tram {
    public static void main(final String args[]) throws IOException {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int maxCapability = 0;
        int passAm = 0;
        for (int i = 0; i < n; i++) {
            final int a = sc.nextInt();
            final int b = sc.nextInt();
            if (a < 0 || b < 0) return;
            passAm += b - a;
            if (passAm > maxCapability) maxCapability = passAm;
        }
        System.out.print(maxCapability);
    }
}
