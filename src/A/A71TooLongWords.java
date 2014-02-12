package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/71/A
 */
public class A71TooLongWords {
    public static void main(final String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        sc.nextLine();
        if (n <= 0) return;
        for (int i = 0; i < n; i++) {
            final String word = sc.nextLine();
            //System.out.println(word);
            if (word.length() > 10) {
                System.out.println(String.format("%s%d%s", word.substring(0, 1), word.length() - 2, word.substring(word.length() - 1)));
            } else {
                System.out.println(word);
            }
        }
    }
}
