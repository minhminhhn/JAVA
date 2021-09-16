import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double T = scan.nextDouble();
        double V = scan.nextDouble();
        double Tx = 13.12 + 0.6215 * T - 11.37 * Math.pow(V, 0.16) + 0.3965 * T * Math.pow(V, 0.16);
        System.out.printf("%.3f", Tx);
    }
}
