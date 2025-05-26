import java.util.Scanner;

public class Main1010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int codPecaUm = scan.nextInt();
        int qtdPecaUm = scan.nextInt();
        double valorPecaUm = scan.nextDouble();

        int codPecaDois = scan.nextInt();
        int qtdPecaDois = scan.nextInt();
        double valorPecaDois = scan.nextDouble();

        double valor = (valorPecaUm * qtdPecaUm) + (valorPecaDois * qtdPecaDois);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);

        scan.close();

    }
}
