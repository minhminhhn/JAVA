import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt(), m = scan.nextInt(), y = scan.nextInt();
        int y0, x, m0, d0;
        y0 = y - (14 - m) / 12;
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        m0 = m + 12 * ((14 - m) / 12) - 2;
        d0 = (d + x + (31 * m0) / 12) % 7;
        switch (d0) {
            case 0: {
                System.out.print("Sunday.");
                break;
            }
            case 1: {
                System.out.print("Monday.");
                break;
            }
            case 2: {
                System.out.print("Tuesday.");
                break;
            }
            case 3: {
                System.out.print("Wednesday.");
                break;
            }
            case 4: {
                System.out.print("Thursday.");
                break;
            }
            case 5: {
                System.out.print("Friday.");
                break;
            }
            case 6: {
                System.out.print("Saturday.");
                break;
            }
            default:
                break;
        }
    }
}
