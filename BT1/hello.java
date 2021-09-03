import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("xin chào, mình tên là Minh");
        System.out.print("Ten: ");
        String name;
        name="Minh";
        System.out.println(name);
        Scanner write = new Scanner(System.in);
        int a;
        a= write.nextInt();
        System.out.print("tuổi: ");
        System.out.print(a);
    }
}