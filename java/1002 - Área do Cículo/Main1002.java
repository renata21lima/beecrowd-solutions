import java.util.Scanner;

public class Main1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();

        double A = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", A);

        scan.close();
    }
}
