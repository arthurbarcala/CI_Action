import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá! Digite um número entre 1 e 10.");

        int num = sc.nextInt();

        boolean res = Sorteador.advinhar(num);

        if ( res ) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Não foi dessa vez...");
        }

    }
}