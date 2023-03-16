import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Boa noite, qual o tamanho do array desejado:");
        int vetorDesejado = scanner.nextInt();

        int[] vetor = new int[vetorDesejado];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor para a " + (i + 1)  + "° posição"+": ");
            int numero = scanner.nextInt();

            while (numero < 0 || numero > 55000) {
                System.out
                        .print("Número inválido! Digite um número inteiro entre 0 e 55000 para a posição " + i + ": ");
                numero = scanner.nextInt();
            }

            vetor[i] = numero;
        }

        OrdenaVetor ordenaVetor = new OrdenaVetor();
        int[] vetorOrdenado = ordenaVetor.ordenaVetor(vetor);

        System.out.print("Vetor original: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < vetorOrdenado.length; i++) {
            System.out.print(vetorOrdenado[i] + " ");
        }
    }

    
}
