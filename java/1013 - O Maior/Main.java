import java.util.Scanner;

public class Main {

    static int maior(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int maiorAB = maior(a, b);
        int maiorABC = maior(maiorAB, c);

        System.out.println(maiorABC + " eh o maior");

        scan.close();
    }
}