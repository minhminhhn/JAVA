public class StdGaussian {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();
        double Z = Math.sin(Math.PI * 2 * v) * Math.sqrt(-2 * Math.log(u));
        System.out.printf("%.5f", Z);
    }
}
