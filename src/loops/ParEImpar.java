package loops;
/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.
 */
import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeNumeros = 0;
        int numero = 0;
        int contador = 0;
        int par = 0, impar = 0;

        
        System.out.println("Quantos números gostia de comparar?");
        quantidadeNumeros = scan.nextInt();

        do {
            contador++;
            System.out.println("Digite o numero " + contador + ": ");
            numero = scan.nextInt();
            if (numero % 2 == 0) par++; 
            else impar++;

        } while (contador < quantidadeNumeros);

        System.out.println("A quantidade de pares: "+par+", e a quantidade de impar: "+impar+".");

   }
}
