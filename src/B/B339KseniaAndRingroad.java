package B;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/339/B
 */
public class B339KseniaAndRingroad {
    public static void main(final String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        int currPlace = 1;
        long sum = 0;
        for (int i = 0; i < m; i++) {
            final int d = sc.nextInt();
            final int moves = d < currPlace ? n - currPlace + d : d - currPlace;
            sum += moves;
            currPlace = d;
        }
        System.out.println(sum);
    }
}
