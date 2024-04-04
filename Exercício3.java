import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int notas = 3;
        double vetor[] = new double[notas];

        System.out.println("Digite a três notas" + notas);
        for (int i = 0; i < notas; i++){
        vetor[i] = scanner.nextDouble();
        soma += vetor[i];
        
    }

        double total = soma / 3;
        System.out.println("As notas serão: " + vetor[0]+ "  " + vetor[1] + "  " + vetor[2]);
        System.out.println("A média dessas notas é: " + total);

        scanner.close();
    }
}
