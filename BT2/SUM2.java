import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;

public class SUM2 {

    public static void sum(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if (a[i] + a[j] == 0) StdOut.printf("%d %d\n", a[i], a[j]);
        }
    }

    public static void main(String[] args) {
        int[] a = StdArrayIO.readInt1D();
        SUM2.sum(a);
    }
}
