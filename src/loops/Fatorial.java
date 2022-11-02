package loops;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número
 * inteiro fornecido pelo usuário
 * Ex.: 5! = 120
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        int numeroFatorial = 0, fatorial =1;
        System.out.println("Digite o núnero que deseja saber o fatorial:");
        numeroFatorial = scan.nextInt();


        for (int i = numeroFatorial; i >= 1;i--) {
            fatorial = fatorial*i;           
            } 

        System.out.println("O fatorial de "+numeroFatorial+" é "+fatorial+".");

    }
}
