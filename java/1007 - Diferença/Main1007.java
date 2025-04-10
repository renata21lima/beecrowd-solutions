
import java.util.Scanner;


public class Main1007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A,B,C,D,DIFERENCA;
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        DIFERENCA = A * B - C * D;
        System.out.println("DIFERENCA = " + DIFERENCA);
        scan.close();
    }
}
