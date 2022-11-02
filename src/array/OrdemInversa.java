package array;
/*
 * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
 */
public class OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {0, -5, 38, -98, 21, 5};
        int contador = 0;
        System.out.print("Vetor: ");
        while(contador <= (vetor.length-1)) {
            System.out.print(vetor[contador]+" ");
            contador++;
        }
        System.out.print("\nVetor inverido: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
    
}
