import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;

        char[] vetor = new char[tamanho];

        System.out.println("Digite os " + tamanho + " caracteres:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.next().charAt(0);
        }

        int consoantes = 0;
        System.out.print("Consoantes lidas: ");
        for (int i = 0; i < tamanho; i++) {
            if (isConsoante(vetor[i])) {
                consoantes++;
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println("\nTotal de consoantes lidas: " + consoantes);

        scanner.close();
    }

    public static boolean isConsoante(char c) {
        c = Character.toLowerCase(c);
        return c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1;
    }
}