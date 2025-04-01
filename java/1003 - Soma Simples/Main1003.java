import java.util.Scanner;

public class Main1003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, soma;

        a = scan.nextInt();
        b = scan.nextInt();

        soma = a + b;
        System.out.printf("SOMA = %d%n", soma);

        scan.close();
    }
}
