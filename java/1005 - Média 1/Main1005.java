
import java.util.Scanner;

public class Main1005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float notaA, notaB, media;
        notaA = scan.nextFloat();
        notaB = scan.nextFloat();
        media = (notaA * 3.5f + notaB * 7.5f) / 11.0f;
        System.out.printf("MEDIA = %.5f\n", media);
        scan.close();
    }
}
