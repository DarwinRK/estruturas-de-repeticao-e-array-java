package loops;
/*Faça um programa que leia 5 núnmeros
 * e informe o maior número
 * e a média desses números
 */

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int maiorNumero = 0;
        int numero = 0;
        int soma = 0;
        int contador = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            contador = contador+1;
            soma = soma + numero;
            
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        } while (contador < 5);
        System.out.println("A média é :" + (soma/5));
        System.out.println("O maior número é: " + maiorNumero);

    }
}
