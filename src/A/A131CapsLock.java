package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/131/A
 */
public class A131CapsLock {
    public static void main(final String args[]) throws IOException {
        final Scanner sc = new Scanner(System.in);
        final String word = sc.nextLine();
        if (word.length() == 0) return;
        if (word.toUpperCase().equals(word)) {
            System.out.print(word.toLowerCase());
            return;
        }
        if (word.length() == 1 && word.toLowerCase().equals(word)) {
            System.out.print(word.toUpperCase());
            return;
        }
        if (word.substring(1).toUpperCase().equals(word.substring(1))) {
            System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
            return;
        }
        System.out.print(word);
    }
}
