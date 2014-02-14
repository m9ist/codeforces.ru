package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/112/A
 */
public class A112PetiaAndStrings {
    public static void main(final String args[]) throws IOException {
        final Scanner sc = new Scanner(System.in);
        final String s1 = sc.nextLine().toLowerCase();
        final String s2 = sc.nextLine().toLowerCase();
        final int eq = s1.compareTo(s2);
        System.out.print((eq == 0 ? 0 : eq/Math.abs(eq)));
    }
}
