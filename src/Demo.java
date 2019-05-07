import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Logo logo = new Logo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input an odd number between the range of 2 and 10 000: ");
        int n = sc.nextInt();
        logo.printOnConsole(n);
    }
}
