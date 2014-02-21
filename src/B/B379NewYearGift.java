package B;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/379/B
 */
public class B379NewYearGift {
    public static void main(final String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int[] money = new int[n];
        for (int i = 0; i < n; i++) {
            money[i] = sc.nextInt();
        }
        int currIndex = 0;
        while (true) {
            boolean needToContinue = false;
            if (money[currIndex] > 0) {
                System.out.print("P");
                money[currIndex]--;
            }
            for (int i = currIndex + 1; i < n; i++) {
                if (money[i] > 0) {
                    System.out.print("R");
                    currIndex++;
                    needToContinue = true;
                    break;
                }
            }
            if (needToContinue) continue;
            for (int i = currIndex - 1; i >= 0; i--) {
                if (money[i] > 0) {
                    System.out.print("L");
                    currIndex--;
                    needToContinue = true;
                    break;
                }
            }
            if (needToContinue) continue;
            if (money[currIndex] > 0) {
                if (currIndex > 0) {
                    System.out.print("L");
                    currIndex--;
                } else {
                    System.out.print("R");
                    currIndex++;
                }
                continue;
            }
            break;
        }
    }
}
