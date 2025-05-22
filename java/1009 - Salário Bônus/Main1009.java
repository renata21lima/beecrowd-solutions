import java.util.Scanner;

public class Main1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.next();
        float salario, vendas, bonus;
        salario = scan.nextFloat();
        vendas = scan.nextFloat();
        bonus = ((vendas * 15)/100) + salario;
        System.out.printf("TOTAL = R$ %.2f\n", bonus);
        scan.close();
    }
}
