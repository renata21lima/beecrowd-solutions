import java.util.Scanner;
public class Main1008{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numeroFuncionario,horasTrabalhada;
        float valorHora, salario;
        numeroFuncionario = scan.nextInt();
        horasTrabalhada = scan.nextInt();
        valorHora = scan.nextFloat();
        salario = horasTrabalhada * valorHora;
        System.out.printf("NUMBER = %d\n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        scan.close();
    }
}