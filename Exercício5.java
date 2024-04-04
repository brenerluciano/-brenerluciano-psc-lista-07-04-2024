import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros = 20;
        int vetor[] = new int[20];

        System.out.println("Digite 20 números inteiros: ");
        for (int i = 0; i < numeros; i++) {
            System.out.println("Qual é o " + (i + 1) + "º número:");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nDados: ");
        System.out.print("\nOs números são: ");
        for (int i = 0; i < numeros; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\n\nNúmeros pares: ");
        for (int i = 0; i < numeros; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        System.out.print("\n\nNúmeros ímpares: ");
        for (int i = 0; i < numeros; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        scanner.close();
    }
}


        
    
    

