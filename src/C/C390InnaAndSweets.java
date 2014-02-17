package C;

import java.io.IOException;

/**
 * http://codeforces.ru/problemset/problem/390/C
 */
public class C390InnaAndSweets {
    public static void main(final String args[]) throws IOException {
        final long t1 = System.currentTimeMillis();
       /* final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int k = sc.nextInt();
        final int w = sc.nextInt();
        sc.nextLine();
        final String word = sc.nextLine();*/
        final int n = 300;
        final int k = 3;
        final int w = 1;
        final String word = "101010001110101000111010100011101010001110101000111010100011101010001110101000111010100011101010001110101000111010100011101010001110101000111010100011101010001110101000111010100011101010001110101000111010100011101010001110101000111010100011101010001110101000111010100011101010001110101000111010100011";
        if (word.length() != n) return;
        final int blockSize;
        switch (k) {
            case 1:
            case 2:
            case 4:
            case 8:
                blockSize = 64;
                break;
            case 3:
            case 7:
            case 9:
                blockSize = 63;
                break;
            case 5:
            case 6:
            case 10:
                blockSize = 60;
                break;
            default:
                blockSize = 0;
                break;
        }
        final int arrLength = n / blockSize + ((n % blockSize > 0) ? 1 : 0);
        final long[] sweets = new long[arrLength];
        final int[] hasSweets = new int[n];
        long vi = 0L;
        for (int i = 0; i < n; i++) {
            final int v = word.substring(i, i + 1).equals("1") ? 1 : 0;
            hasSweets[i] = v;
            if (i % blockSize == 0) {
                if (i > 0) sweets[i / blockSize - 1] = vi;
                vi = ((long) v) << (blockSize - 1);
            } else vi |= (((long) v) << (blockSize - (i % blockSize) - 1));
        }
        if ((n - 1) % blockSize > 0) sweets[arrLength - 1] = vi;
        for (int i = 0; i < w; i++) {
            /*final int l = sc.nextInt();
            final int r = sc.nextInt();*/
            final int l = 1;
            final int r = n;
            int count = 0;
            if (r - l > 3 * blockSize) {
                final int lowBound = (l - 1) / blockSize + ((l - 1) % blockSize > 0 ? 1 : 0);
                final int highBound = (r - 1) / blockSize;
                for (int j = l - 1; j < lowBound * blockSize; j++) {
                    if ((r - j - 1) % k == 0) count += 1 - hasSweets[j];
                    else count += hasSweets[j];
                }
                for (int j = highBound * blockSize; j < r; j++) {
                    if ((r - j - 1) % k == 0) count += 1 - hasSweets[j];
                    else count += hasSweets[j];
                }
                // todo count eachK
                long eachK = 0L;
                for (int j = blockSize - k + (r - 1 - lowBound * blockSize) % k; j >= 0; j -= k) {
                    eachK |= 1L << j;
                }
                int j = 0;
                // todo пройтись итерацией между границами
            } else {
                for (int j = r - 1; j >= l - 1; j--) {
                    if ((r - j - 1) % k == 0) count += 1 - hasSweets[j];
                    else count += hasSweets[j];
                }
            }
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

    private static int countBits(long number) {
        int sum = 0;
        for (int i = 0; i < 64; i++) {
            if ((number & 1) == 1) sum++;
            number >>= 1;
        }
        return sum;
    }

    private static String toString(final long w) {
        String s = "";
        for (int i = 0; i < 64; i++) {
            s = (((w & (1L << i)) > 0) ? "1" : "0") + s;
        }
        return s;
    }
}
