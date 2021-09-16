import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

public class UFclient2 {
    public static void main(String[] args) {
        int x = 0;
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            x++;
            if (!uf.connected(p, q)) {
                uf.union(p, q);
            }
            if (uf.count() == 1) {
                StdOut.println(x);
                return;
            }
        }
        if (uf.count() != 0) {
            StdOut.println("FAILED");
        }
    }
}
