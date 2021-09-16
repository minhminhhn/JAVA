import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class SUM3 {
    public static int supersort(int[] a) {
        int count;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
        }
        count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1])
                count++;
        }
        return count;
    }

    public static void three(int[] a) {
        int n = a.length;
        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = i1 + 1; i2 < n; i2++) {
                for (int i3 = i2 + 1; i3 < n; i3++) {
                    if ((a[i1] + a[i2] + a[i3] == 0)) {
                        StdOut.println(a[i1] + " " + a[i2] + " " + a[i3]);
                    }
                }
            }
        }
    }

    public static void cut(int[] a, int[] b) {
        b[0] = a[0];
        int n = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                b[n] = a[i];
                n++;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int count;
        for (int i = 0; i < n; i++) a[i] = scan.nextInt();
        count = SUM3.supersort(a);
        int[] b = new int[count];
        StdOut.println(count);
        SUM3.cut(a, b);
        SUM3.three(b);
    }
}
