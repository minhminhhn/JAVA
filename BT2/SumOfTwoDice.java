public class SumOfTwoDice {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            double random = Math.random();
            random = random * 6 + 1;
            sum += (int) random;
        }
        System.out.print(sum);
    }
}
