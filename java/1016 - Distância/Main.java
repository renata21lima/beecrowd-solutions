import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int km = scan.nextInt();
        int tempo = km * 2;
        System.out.println(tempo + " minutos");
    }
}