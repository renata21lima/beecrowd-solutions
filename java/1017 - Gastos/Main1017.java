
import java.util.Scanner;


public class Main1017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horas = scan.nextInt();
        int kmH = scan.nextInt();

        double resultado = (kmH / 12.0) * horas;

        System.out.printf("%.3f%n", resultado);
    }    
}
