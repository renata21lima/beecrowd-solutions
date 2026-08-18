import java.util.Scanner;

public class Main1014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distanciaKM = scan.nextInt();
        double combustivel = scan.nextDouble();
        double consumo = distanciaKM / combustivel;
        System.out.printf("%.3f km/l", consumo);
    }
}
