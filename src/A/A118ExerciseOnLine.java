package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/118/A
 */
public class A118ExerciseOnLine {
    public static void main(final String args[]) throws IOException {
        final Scanner sc = new Scanner(System.in);
        final String line = sc.nextLine().toLowerCase();
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            final String ch = line.substring(i, i + 1);
            if (!isVowel(ch)) sb.append(".").append(ch);
        }
        System.out.print(sb.toString());
    }

    private static boolean isVowel(final String ch) {
        return "a".equals(ch)
                || "o".equals(ch)
                || "y".equals(ch)
                || "e".equals(ch)
                || "u".equals(ch)
                || "i".equals(ch);
    }
}
