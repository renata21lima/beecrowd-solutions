import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double A,B,C;
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        
        double area_triangulo = (A * C)/2;
        double area_circulo = 3.14159 * Math.pow(C, 2);
        double area_trapezio = (((A + B)*C)/2);
        double area_quadrado = Math.pow(B, 2);
        double area_retangulo = A * B;
        
        System.out.printf("TRIANGULO: %.3f\n", area_triangulo);
        System.out.printf("CIRCULO: %.3f\n", area_circulo);
        System.out.printf("TRAPEZIO: %.3f\n", area_trapezio);
        System.out.printf("QUADRADO: %.3f\n", area_quadrado);
        System.out.printf("RETANGULO: %.3f\n", area_retangulo);
        
    }
}
