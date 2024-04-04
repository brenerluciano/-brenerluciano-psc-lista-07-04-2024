import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numeros = 5;
        int vetor[] = new int[numeros];
        int soma = 0;
        int multiplicaçao = 0;


        System.out.println("Insira os 5 números inteiros: ");
        for (int i = 0; i < numeros; i++){
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
            multiplicaçao = vetor[0] * vetor[1] * vetor[2] * vetor[3] * vetor[4] ;


        }
        System.out.println("A soma dos números será: " + soma);
        System.out.println("Multiplicação dos números: " + multiplicaçao);
        System.out.println("Números interos digitados:  " + vetor[0] + "   " + vetor[1] + "   " + vetor[2] + "   " + vetor[3] + "   " + vetor[4]);

        scanner.close();
    }
}