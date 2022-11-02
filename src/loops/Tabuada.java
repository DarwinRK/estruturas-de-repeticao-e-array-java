package loops;
/*
 * Desenvolva um gerador de tabuada capaz de gerar a tabuada de um número inteiro
 * informado pelo usuário. A saida deve ser conforme exemplo abaixo:
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * .
 * .
 * .
 * 5 x 10 = 50
 */
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        String continua = "Nao";
        System.out.println("Digite o numero que deseja saber a tabuada:");
        numero = scan.nextInt();
        System.out.println("Tabuada de "+numero+":");

        for (int i = 1; i<=10;i++) {
            System.out.println(numero+" x "+i+" = "+(numero*i));
        } 
    }
    
}
