import java.util.Scanner;
public class Main1008{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero_funcionario, horas_trabalhadas;
        float salario_hora, salario_total;
        
        numero_funcionario = scan.nextInt();
        horas_trabalhadas = scan.nextInt();
        salario_hora = scan.nextFloat();
        
        salario_total = horas_trabalhadas * salario_hora;
        System.out.println("NUMBER = " + numero_funcionario);
        System.out.printf("SALARY = U$ %.2f\n", salario_total);
        
        scan.close();
    }
}